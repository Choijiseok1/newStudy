package board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.Board;

/**
 * Servlet implementation class BoardList
 */
@WebServlet("/blist")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 페이지별로 출력되는 게시글 전체 조회 처리용 컨트롤러
				//페이지 기본값 지정
				int currentPage = 1;
				//전달된 페이지값 추출
				if(request.getParameter("page") != null) {
					currentPage = Integer.parseInt(request.getParameter("page"));
				}
		int limit=10;
		BoardService bservice= new BoardService();
		int listCount = bservice.getListCount();
		
		System.out.println(listCount);
		//총 페이지 수 계산.
		int maxPage= (int)((double)listCount / limit  + 0.9) ;
		//현재 페이지에 보여줄 그룹의 시작
		
		// 현재 페이지가 13페이지이면, 그룹은 11페이지 부터 20페이지가 보여져야 한다.
		int startPage=((int)((double)currentPage/limit+0.9)-1)*limit+1;
		int endPage=startPage+limit-1;
		
		if(maxPage<endPage)endPage=maxPage;
		
		ArrayList<Board> list=bservice.selectList(currentPage,limit);
		response.setContentType("text/html; charset=utf-8"); 
		RequestDispatcher view=null;
		if(list.size()>0) {
			view=request.getRequestDispatcher("views/board/boardListView.jsp");
			request.setAttribute("list",list);
			request.setAttribute("currentPage",currentPage);
			request.setAttribute("maxPage",maxPage);
			request.setAttribute("startPage",startPage);
			request.setAttribute("endPage",endPage);
			request.setAttribute("listCount",listCount);
			view.forward(request, response);
		}else{
			view=request.getRequestDispatcher("views/board/boardError.jsp");
			request.setAttribute("message",currentPage+"페이지 참조 실패");
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
