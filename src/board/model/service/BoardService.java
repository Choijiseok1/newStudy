package board.model.service;
import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;


import board.model.dao.BoardDao;
import board.model.vo.Board;
public class BoardService {
public BoardService() {
	// TODO Auto-generated constructor stub
}
	public int getListCount() {
	Connection con=getConnection();
	int listCount= new BoardDao().getListCount(con);
	close(con);
	
	return listCount;
	}
	public ArrayList<Board> selectList(int currentPage, int limit) {
		Connection con=getConnection();
	
		ArrayList<Board> list=new BoardDao().selectList(con,currentPage,limit);
		
		return list;
	}
	public int insertBoard(Board bo) {
		Connection con=getConnection();
		
		int result=new BoardDao().insertBoard(con,bo);
		if(result>0)
			commit(con);
		else
			rollback(con);
			close(con);
		return result;
	}
	public Board selectByNo(int boardnum) {
	Connection con=getConnection();
		
		Board bo=new BoardDao().selectByNo(con,boardnum);
		
		close(con);
		
		
		return bo;
	}
}
