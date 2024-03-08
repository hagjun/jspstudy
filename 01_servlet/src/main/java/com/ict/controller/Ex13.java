package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.Command01;
import com.ict.model.Command02;
import com.ict.model.Command03;

@WebServlet("/Ex13")
public class Ex13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// 모든 서버가 cmd 를 갖고 넘어와야 된다.
		String cmd = request.getParameter("cmd");
		/*
		switch (cmd) {
		case "1":
			Command01 cmd01 = new Command01();
			String path = cmd01.exec(request, response);
			// request 의 정보를 가지고 가야 한다. => 포워딩 한다.
			request.getRequestDispatcher(path).forward(request, response);
			break;
		case "2":
			Command02 comd02 = new Command02();
			String path02 = comd02.exec(request, response);
			// request 의 정보를 가지고 가야 한다. => 포워딩 한다.
			request.getRequestDispatcher(path02).forward(request, response);
			break;
		case "3":
			Command03 comd03 = new Command03();
			String path03 = comd03.exec(request, response);
			// request 의 정보를 가지고 가야 한다. => 포워딩 한다.
			request.getRequestDispatcher(path03).forward(request, response);

			break;
		}
		 */
		// 공통적으로 상속받는 Command 가 있을시에 comm 으로 만들어서 코드를 한줄로 사용할 수 있다.
		Command comm = null;
		switch (cmd) {
		case "1": comm = new Command01(); break; // 클래스를 받아오려면 객체 생성을 한다.
		case "2": comm = new Command02(); break;
		case "3": comm = new Command03(); break;
	}
		// exec 호출
		String path = comm.exec(request, response);
		// request 의 정보를 가지고 가야 한다. => 포워딩 한다.
		// 요청을 받아서 그요청에 맞는 Model 들한테 보내고 Model 들한테 정보를 받아서 포워딩해서 보여준다.
		request.getRequestDispatcher(path).forward(request, response);
	}

}
