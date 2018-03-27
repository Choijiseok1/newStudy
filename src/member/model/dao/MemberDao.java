package member.model.dao;

import java.sql.*;
import java.util.ArrayList;

import member.model.vo.Member;
import oracle.net.aso.r;

import static common.JDBCTemplate.*;

public class MemberDao {
	public MemberDao() {
		
	}
	
	public Member loginMember(Connection con, 
			String userId, String userPwd) {
		
		Member loginUser = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where userid= ? "
				+ "and userpwd = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				loginUser = new Member();
				
				loginUser.setUserId(rset.getString("userid"));
				loginUser.setUserPwd(rset.getString("userpwd"));
				loginUser.setUserName(rset.getString("username"));
				loginUser.setGender(rset.getString("gender"));
				loginUser.setAge(rset.getInt("age"));
				loginUser.setPhone(rset.getString("phone"));
				loginUser.setEmail(rset.getString("email"));
				loginUser.setHobby(rset.getString("hobby"));
				loginUser.setEtc(rset.getString("etc"));
				loginUser.setEnroll(rset.getDate("enroll_date"));
				loginUser.setLastModified(rset.getDate("lastmodified"));
			}
			
			//System.out.println("dao : " + loginUser);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return loginUser;		
	}

	public int insertMember(Connection con, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate, sysdate)";
		
		 try {
			 
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());
			pstmt.setString(3, member.getUserName());
			pstmt.setString(4, member.getGender());
			pstmt.setInt(5, member.getAge());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getEmail());
			pstmt.setString(8, member.getHobby());
			pstmt.setString(9, member.getEtc());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateMember(Connection con, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;		
		String query = "update member set userpwd = ?, age = ?, "
				+ "phone = ?, email = ?, hobby = ?, etc = ?, "
				+ "lastmodified = sysdate where userid = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getUserPwd());			
			pstmt.setInt(2, member.getAge());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getHobby());
			pstmt.setString(6, member.getEtc());
			pstmt.setString(7, member.getUserId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}		
		return result;
	}
	public int deleteMember(Connection con, String userId) {
		int result = 0;	
		PreparedStatement pstmt = null;
		
		String query = "delete from member where userid = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public Member selectMember(Connection con, String userId) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where userid = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				member.setUserId(userId);
				member.setUserPwd(rset.getString("userpwd"));
				member.setUserName(rset.getString("username"));
				member.setGender(rset.getString("gender"));
				member.setAge(rset.getInt("age"));
				member.setPhone(rset.getString("phone"));
				member.setEmail(rset.getString("email"));
				member.setHobby(rset.getString("hobby"));
				member.setEtc(rset.getString("etc"));
				member.setEnroll(rset.getDate("enroll_date"));
				member.setLastModified(rset.getDate("lastmodified"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
				
		return member;
	}

	public ArrayList<Member> selectList(Connection con) {
		ArrayList<Member> list = new ArrayList<Member>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member";
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Member m = new Member();
				m.setUserId(rset.getString("userid"));
				m.setUserPwd(rset.getString("userpwd"));
				m.setUserName(rset.getString("username"));
				m.setGender(rset.getString("gender"));
				m.setAge(rset.getInt("age"));
				m.setPhone(rset.getString("phone"));
				m.setEmail(rset.getString("email"));
				m.setHobby(rset.getString("hobby"));
				m.setEtc(rset.getString("etc"));
				m.setEnroll(rset.getDate("enroll_date"));
				m.setLastModified(rset.getDate("lastmodified"));
				
				list.add(m);								
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return list;
	}

	public int checkId(Connection con, String parameter) {
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		int re=0;
		String query = "select * from member where USERID = ?";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, parameter);
			rset=pstmt.executeQuery();
			if(rset.next()) {
				re=100;
			}
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		return re;
	}
	
}
