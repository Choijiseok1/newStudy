package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LogInServlet
 */
//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	//서블릿은 http서블릿을 상속받은 후손이다.
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
       super();        
       System.out.println("로그인 서블릿 ");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
    	//System.out.println("로그인 서블릿 구동됨...")
    	//1. 전송온 값에 한글이 있을경우 인코딩 처리함.
    
        //2. 전송온 값 꺼내서 변수에 저장하기
        String userId = request.getParameter("userid");
        String userPwd = request.getParameter("userpwd");
        System.out.println("아이디 : " + userId + "암호 : " + userPwd);
        
        //3. 비즈니스 로직을 처리할 서비스 모델 클래스의
        //로그인 처리용 메소드로 값을 전달하고, 결과를 받음.
        Member loginUser = new MemberService().loginCheck(userId, userPwd);
        
        //4. 받은 결과를 가지고 성공/ 실패에 따라 뷰를 선택해서 내보냄
        response.setContentType("text/html; charset=utf-8");
        if(loginUser != null) {
        	//로그인 성공 처리 : session 객체 이용
        	HttpSession session = request.getSession();
        	//session.setMaxInactiveInterval(60*30); 세션 객체 자동 파기.
        	//System.out.println("session id : " + session.getId());
        	
        	session.setAttribute("loginUser", loginUser);
        	
        	response.sendRedirect("/first/index.jsp");
        	
        } else {
        	
        	response.sendRedirect("/first/views/member/loginFail.html");
        	
        }		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
