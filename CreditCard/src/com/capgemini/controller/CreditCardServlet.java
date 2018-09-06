package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/credit")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreditCardServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String creditNumber=request.getParameter("cardnumber");
		int cardnumber=Integer.parseInt(creditNumber);
		String number=request.getParameter("cvv");
		int cvv=Integer.parseInt(number);
		String month=request.getParameter("month");
//		int mm=Integer.parseInt(month);
		String year=request.getParameter("year");
//		int yy=Integer.parseInt(year);
		out.println("HolderName: "+username+"<br>Cardnumber :"+cardnumber+"<br>Cvv :"+cvv+"<br>expiry month and year " +month  +year);
	}

}
