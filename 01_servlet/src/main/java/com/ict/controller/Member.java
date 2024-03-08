package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.AccountCommand;
import com.ict.model.AccountOkCommand;
import com.ict.model.Command;
import com.ict.model.LoginCommand;
import com.ict.model.LoginOKCommand;


@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		
		Command comm = null;
		switch (cmd) {
			case "login": comm = new LoginCommand();	    break;
			case "login_ok": comm = new LoginOKCommand();	    break;
			case "account": comm = new AccountCommand(); 	break;
			case "account_ok": comm = new AccountOkCommand(); 	break;
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
		
	}

	

}
