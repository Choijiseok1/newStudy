package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.Board;

/**
 * Servlet implementation class BoardDetail
 */
@WebServlet("/bdetail")
public class BoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//각 게시판의 상세정보.
		
	request.setCharacterEncoding("utf-8");
	int boardnum=Integer.parseInt(request.getParameter("bnum"));
	
	Board bo=new BoardService().selectByNo(boardnum);
	RequestDispatcher view=null;
	response.setContentType("text/html; charset=UTF-8");
	if(bo!=null) {
		view=request.getRequestDispatcher("views/board/boardDetail.jsp");
		request.setAttribute("Board",bo);
		view.forward(request, response);		
	}else {
		view=request.getRequestDispatcher("views/board/boardError.jsp");
		request.setAttribute("message","관리자에게 연락하세여");
		view.forward(request, response);		
		
	}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
