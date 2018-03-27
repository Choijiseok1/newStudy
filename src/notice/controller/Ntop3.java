package notice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class Ntop3
 */
@WebServlet("/ntop3")
public class Ntop3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ntop3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("no"));
		
		ArrayList<Notice> no=new NoticeService().selectTop3();
		JSONObject json=new JSONObject();
		JSONArray jarr=new JSONArray();
 
		if(no!=null) {
			for(Notice i: no) {
				JSONObject job=new JSONObject();
				job.put("NOTICENO",i.getNoticeNo());
				job.put("NOTICETITLE",i.getNoticeTitle());
				job.put("NOTICEDATE",i.getNoticeDate().toString());
				job.put("NOTICEWRITER",i.getNoticeWriter());
				job.put("NOTICECONTENT",i.getNoticeContent());
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

}
