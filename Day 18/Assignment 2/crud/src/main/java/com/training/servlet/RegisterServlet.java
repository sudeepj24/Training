package com.training.servlet;

import java.io.IOException;

import com.training.entity.employee_entity;
import com.training.service.EmployeeService;
import com.training.service.impl.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empnum = request.getParameter("empnum");
		String empname = request.getParameter("empname");
	    String empsalary = request.getParameter("empsalary");
	    
	    employee_entity emp = new employee_entity();
	    emp.setId(Integer.parseInt(empnum));
	    emp.setName(empname);
	    emp.setId(Integer.parseInt(empsalary));
	    
	    EmployeeService eService = new EmployeeServiceImpl();
	    boolean result = eService.insertEmployee(emp);
	    
	    if(result) {
	    	response.sendRedirect("/success.html");
	    }
	    else {
	    	response.sendRedirect("/error.html");
	    }
	    
	    
	    
	}

}
