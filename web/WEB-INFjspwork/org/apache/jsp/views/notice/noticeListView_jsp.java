/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.27
 * Generated at: 2018-03-21 00:25:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import notice.model.vo.Notice;
import java.util.*;
import member.model.vo.Member;

public final class noticeListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/notice/../../header.jsp", Long.valueOf(1521521081969L));
    _jspx_dependants.put("/views/notice/../../footer.html", Long.valueOf(1521516699019L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"./noticeError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	List<Notice> list = (List<Notice>)request.getAttribute("noticeList");
	Member loginUser = (Member)session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=UTF-8>\r\n");
      out.write("<title>noticeListView</title>\r\n");
      out.write("\t<style type=\"text/css\"></style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction moveWritePage() {\r\n");
      out.write("\t\t\t//글쓰기 버튼을 클릭하면 notiveWriteForm.jsp 파일로 페이지 이동함\r\n");
      out.write("\t\t\tlocation.href = \"/first/views/notice/noticeWriteForm.jsp\";\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=UTF-8>\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<link href=\"/first/resources/css/header.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<h1>first web application</h1>\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<li><a href=\"/first/index.jsp\">home</a></li>\r\n");
      out.write("\t<li><a href=\"/first/nlist\">공지사항</a></li>\r\n");
      out.write("\t<li><a href=\"/first/blist?page=1\">게시글</a></li>\r\n");
      out.write("\t<li><a href=\"\">앨범</a></li>\r\n");
      out.write("\t<li><a href=\"\">자료실</a></li>\r\n");
      out.write("\t\r\n");
      out.write("\t</ul>\t\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<hr style=\"clear:both;\">\r\n");
      out.write("<br>\r\n");
      out.write("<h2 align=\"center\">공지글 전체 목록</h2>\r\n");
      out.write("\r\n");
 if(loginUser.getUserId().equals("aaaa")) { 
      out.write("\r\n");
      out.write("\t<button id = \"writeBtn\" onclick=\"moveWritePage();\">글쓰기</button>\r\n");
 } else { 
      out.write("\r\n");
      out.write("\t<button disabled>글쓰기</button>\r\n");
 } 
      out.write("\r\n");
      out.write("<table align=\"center\" width=\"650\" cellspacing=\"0\" border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>번호</th>\r\n");
      out.write("\t\t<th>제목</th>\r\n");
      out.write("\t\t<th>작성자</th>\r\n");
      out.write("\t\t<th>날짜</th>\r\n");
      out.write("\t\t<th>첨부파일</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 for( Notice n : list ) { 
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align = \"center\">");
      out.print( n.getNoticeNo() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td align = \"center\">\r\n");
      out.write("\t\t\t");
 if(loginUser != null) { //로그인 된 경우 상세보기 연결
      out.write("\r\n");
      out.write("\t\t\t<a href = \"/first/ndetail?no=");
      out.print( n.getNoticeNo() );
      out.write("\" style = \"text-decoration : hand\"\r\n");
      out.write("\t\t\t>");
      out.print( n.getNoticeTitle() );
      out.write("</a>\t\t\t\r\n");
      out.write("\t\t\t");
 } else { //로그인 되지 않은 상태라면 제목만 보여줌.
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print( n.getNoticeTitle() );
      out.write("\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td align = \"center\">");
      out.print( n.getNoticeWriter() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td align = \"center\">");
      out.print( n.getNoticeDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td align = \"center\">\r\n");
      out.write("\t\t\t");
 if(n.getOriginalFilePath() != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t◎\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>footer</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\th5 {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tbackground : navy;\r\n");
      out.write("\t\tcolor : white;\r\n");
      out.write("\t\twidth : 80%;\r\n");
      out.write("\t\theight : 70px;\r\n");
      out.write("\t\tpadding-top : 15px;\r\n");
      out.write("\t\tmargin-bottom: 0px;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h5 align=\"center\">copyright@2018.03.13 kh.org<br>\r\n");
      out.write("\ttel : 02-1234-5678 &nbsp; &nbsp;\r\n");
      out.write("\tfax : 02-1234-5678\r\n");
      out.write("\t</h5>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
