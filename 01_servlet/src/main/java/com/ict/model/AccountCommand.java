package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.MemberDAO;
import com.ict.db.MemberVO;

public class AccountCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		
		
		return "guestbook/account.jsp";
	}

}
