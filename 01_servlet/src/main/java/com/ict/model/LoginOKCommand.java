package com.ict.model;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ict.db.MemberDAO;
import com.ict.db.MemberVO;





public class LoginOKCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
	
		
		MemberVO mvo = new MemberVO();
		mvo.setId(id);
		mvo.setPwd(pwd);
		MemberVO mvo2 = MemberDAO.getOneList(mvo);
		
		int res = 0;
		if(mvo2 == null) {
			return "guestbook/login.jsp";
		}else {
			res=1;
			request.setAttribute("mvo", mvo2);
		 request.setAttribute("res", res);	
//			String name = request.getAttributeNames();
//			System.out.println(name);
			return "guestbook/index.jsp";
		
			
		}
		
	}
}
