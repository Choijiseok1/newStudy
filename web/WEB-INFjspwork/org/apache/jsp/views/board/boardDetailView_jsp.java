/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.27
 * Generated at: 2018-03-21 00:24:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import board.model.vo.Board;
import java.util.*;
import java.sql.Date;

public final class boardDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../../footer.html", Long.valueOf(1521516699019L));
    _jspx_dependants.put("/views/board/../../header.jsp", Long.valueOf(1521521081969L));
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
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.Board");
    _jspx_imports_classes.add("java.sql.Date");
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
      			"boardError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
	
	Board board = (Board)request.getAttribute("board");	
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();	

	Member loginUser = (Member)session.getAttribute("loginUser");

      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>boardDetailView</title>\r\n");
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
      out.write("<table align=\"center\" cellpadding=\"10\" cellspacing=\"0\" border=\"1\" width=\"500\"> \r\n");
      out.write("    <tr align=\"center\" valign=\"middle\">  \r\n");
      out.write("          <th colspan=\"2\">\r\n");
      out.write("          ");
      out.print( board.getBoardNum() );
      out.write(" 번글 상세보기</th> \r\n");
      out.write("    </tr>      \r\n");
      out.write("    <tr><td height=\"15\" width=\"100\">제 목</td>          \r\n");
      out.write("        <td>");
      out.print( board.getBoardTitle() );
      out.write("</td> \r\n");
      out.write("    </tr>     \r\n");
      out.write("    <tr><td>내 용</td> \r\n");
      out.write("        <td>");
      out.print( board.getBoardContent() );
      out.write("</td>         \r\n");
      out.write("    </tr> \r\n");
      out.write("    <tr><td>첨부파일</td> \r\n");
      out.write("        <td>");
 if(board.getBoardOriginalFileName() == null){ 
      out.write("\r\n");
      out.write("        \t첨부파일 없음 \r\n");
      out.write("        \t");
 }else{ 
      out.write("\r\n");
      out.write("        \t<a href=\"/first/bfdown?ofile=");
      out.print( board.getBoardOriginalFileName() );
      out.write("&rfile=");
      out.print( board.getBoardRenameFileName() );
      out.write('"');
      out.write('>');
      out.print( board.getBoardOriginalFileName() );
      out.write("</a>         \r\n");
      out.write("        \t");
 } 
      out.write(" \r\n");
      out.write("        </td> \r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr align=\"center\" valign=\"middle\"> \r\n");
      out.write("        <td colspan=\"2\"> \r\n");
      out.write("         ");
 if(loginUser != null){ 
      out.write("            \r\n");
      out.write("            <a href=\"/first/views/board/boardReplyForm.jsp?bnum=");
      out.print( board.getBoardNum() );
      out.write("&page=");
      out.print( currentPage );
      out.write("\"> [댓글달기] </a> &nbsp;&nbsp; \r\n");
      out.write("         ");
 if(loginUser.getUserId().equals(board.getBoardWriter()) == true){ 
      out.write("\r\n");
      out.write("            <a href=\"/first/bupview?bnum=");
      out.print( board.getBoardNum() );
      out.write("&page=");
      out.print( currentPage );
      out.write("\"> [수정페이지로 이동] </a> &nbsp;&nbsp; \r\n");
      out.write("            <a href=\"/first/bdelete?bnum=");
      out.print( board.getBoardNum() );
      out.write("\"> [글삭제] </a> &nbsp;&nbsp; \r\n");
      out.write("         ");
 }} 
      out.write("\r\n");
      out.write("            <a href=\"/first/blist?page=");
      out.print( currentPage );
      out.write("\">[목록]</a>            \r\n");
      out.write("        </td> \r\n");
      out.write("    </tr> \r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
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
