package board.model.dao;

import java.sql.*;
import java.util.ArrayList;

import board.model.vo.Board;

import static common.JDBCTemplate.*;

public class BoardDao {
	public BoardDao() {}

	public int getListCount(Connection con) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from board";
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}

	public ArrayList<Board> selectList(Connection con, 
			int currentPage, int limit) {
		ArrayList<Board> list = new ArrayList<Board>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from "
				+ "(select rownum rnum, board_num, "
				+ "board_title, board_writer, board_content, "
				+ "board_original_filename, board_rename_filename, "
				+ "board_date, board_readcount, board_level, "
				+ "board_ref, board_reply_ref, board_reply_seq "
				+ "from (select * from board order by "
				+ "board_ref desc, board_reply_ref desc, "
				+ "board_level asc, board_reply_seq asc)) "
				+ "where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Board b = new Board();
				b.setBoardNum(rset.getInt("board_num"));
				b.setBoardTitle(rset.getString("board_title"));
				b.setBoardWriter(rset.getString("board_writer"));
				b.setBoardContent(rset.getString("board_content"));
				b.setBoardDate(rset.getDate("board_date"));
				b.setBoardReadCount(rset.getInt("board_readcount"));
				b.setBoardOriginalFileName(rset.getString("board_original_filename"));
				b.setBoardRenameFileName(rset.getString("board_rename_filename"));
				b.setBoardLevel(rset.getInt("board_level"));
				b.setBoardRef(rset.getInt("board_ref"));
				b.setBoardReplyRef(rset.getInt("board_reply_ref"));
				b.setBoardReplySeq(rset.getInt("board_reply_seq"));
				list.add(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int insertBoard(Connection con, Board bo) {
		int result=0;
		PreparedStatement pstmt = null;

		String query="insert into board values((select max(board_num)+1 from board),?,?,?,?,?,sysdate,0,(select max(board_num)+1 from board),Null,default,default)";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, bo.getBoardTitle());
			pstmt.setString(2, bo.getBoardWriter());
			pstmt.setString(3, bo.getBoardContent());
			pstmt.setString(4, bo.getBoardOriginalFileName());
			pstmt.setString(5, bo.getBoardRenameFileName());
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
}














