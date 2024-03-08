package com.ict.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = MemberDBService.getFactory().openSession();
		}
		return ss;
	}
	// 리스트
		public static List<MemberVO> getList(){
			List<MemberVO> list = null;
			list = getSession().selectList("userMember.list");
			return list;
		}
		
		public static MemberVO getOneList(MemberVO mvo) {
			MemberVO mvo2 = null;
			mvo2 = getSession().selectOne("userMember.login", mvo);
			return mvo2;
		}
		
		public static int getInsert(MemberVO mvo) {
			try {
				int result = 0;
				result = getSession().insert("userMember.insert", mvo);
				ss.commit();
				return result;
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}

}
