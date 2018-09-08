package com.capgemini.employeeapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employeeapp.dao.EmployeeDao;


@WebServlet("/deleteEmployee")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	private ServletContext context;
    
    public DeleteEmployeeController() {
        super();
        
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	context = config.getServletContext();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	//employeeDao = (EmployeeDao) context.getAttribute("employeeDao");	
		String empId=request.getParameter("id");
		int empid=Integer.parseInt(empId);
		
		
		employeeDao = (EmployeeDao) context.getAttribute("employeeDao");	
		RequestDispatcher dispatcher;

if(employeeDao.deleteEmployee(empid))
{
	
	
	request.setAttribute("employeesList",employeeDao.findAllEmployees());
	dispatcher = request.getRequestDispatcher("displayAllEmployeeDetails.jsp");
	dispatcher.forward(request, response);	
	}
else
{
	dispatcher = request.getRequestDispatcher("error.jsp");
	dispatcher.forward(request, response);
}
}
}

