package board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.sun.corba.se.impl.protocol.BootstrapServerRequestDispatcher;
import com.sun.org.apache.xerces.internal.util.URI;

import board.model.service.BoardService;
import board.model.vo.Board;

/**
 * Servlet implementation class BoardTop3
 */
@WebServlet("/btop3")
public class BoardTop3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardTop3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("no"));//연동 확인용
		
		JSONObject json=new JSONObject();
		
		JSONArray jarr=new JSONArray();
		
		ArrayList<Board> bo=new BoardService().selectTop3();
		
		for(Board i : bo) {
		JSONObject job=new JSONObject();
		job.put("board_num",i.getBoardNum());
		job.put("BOARD_TITLE",i.getBoardTitle());
		job.put("bOARD_WRITER",i.getBoardWriter());
		job.put("BOARD_DATE",i.getBoardDate().toString());
		job.put("BOARD_READCOUNT",i.getBoardReadCount());
		jarr.add(job);			
		}
		
		json.put("list",jarr);
		response.setContentType("application/json; charset=utf-8");
		System.out.println("json : " + json.toJSONString());

		PrintWriter out=response.getWriter();
		out.print(json.toJSONString());
		out.flush();
		out.close();
		
		
	}

}
