package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.capgemini.domain.Employee;


@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmployeeServlet() {
        super();
        }
    private ArrayList<Employee> employee=new ArrayList<>();
@Override
public void init() throws ServletException {
employee.add(new Employee("swathi",30000.0,"L&D",200));
employee.add(new Employee("nikitha",25000.0,"FS",201));
employee.add(new Employee("kavya",40000.0,"Testing",203));
employee.add(new Employee("bindu",60000.0,"Java",204));
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String empId=request.getParameter("username");
		int employeenum=Integer.parseInt(empId);
		
		int count=0;
		for (Employee employee2 : employee) {
			if(employee2.getemployeeId()==employeenum)
			{
				count=1;
				out.println("<table border=1> <tr> <th>empName</th> <th>salary</th><th>nameOfTheDept</th><th>employeeId</th>");
				out.println("<tr> <td>"+employee2.getEmpName()+"</td> <td>"+employee2.getSalary()+"</td><td>"+employee2.getNameOfTheDept()+"</td><td>"+employee2.getemployeeId()+"</td></tr>");
			}
			
		}
		if(count==0)
		{
			out.println("id not found");
		}
	}	
}

