/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.27
 * Generated at: 2018-03-21 00:15:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/adminHeader.jsp", Long.valueOf(1520918813118L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1521521081969L));
    _jspx_dependants.put("/footer.html", Long.valueOf(1521516699019L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

    
    //일반적인 자바 소스 코드가 작성되는 영역임 : 스크립트릿 태그
    Member loginUser = (Member)session.getAttribute("loginUser");
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>first</title>\r\n");
      out.write("<link href=\"resources/css/header.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
 if(loginUser != null && loginUser.getUserId().equals("admin")) {
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>adminHeder</title>\r\n");
      out.write("<link href=\"resources/css/adminheader.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<h1>first web application</h1>\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<li><a href=\"/first/index.jsp\">home</a></li>\r\n");
      out.write("\t<li><a href=\"/first/mall\">회원관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">공지관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">게시글관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">앨범관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">자료실관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">자료실</a></li>\r\n");
      out.write("\t\r\n");
      out.write("\t</ul>\t\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');
 } else { 
      out.write("\r\n");
      out.write("\t\t");
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
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<hr style=\"clear:both;\">\r\n");
      out.write("   <div id=\"banner\" style=\"margin-left:40px; float:left; margin-right:15px;\">\r\n");
      out.write("      <img src=\"resources/images/무한극장.gif\" width=\"520px\" height=\"150px\">\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("   ");

   
   		if(loginUser == null) {
   
   
      out.write("\r\n");
      out.write("   <form action=\"login\" method=\"post\">\r\n");
      out.write("      <table width=\"220px\" height=\"85px\">   <!-- 서버쪽에선 반드시 name이 필요하다!!! -->\r\n");
      out.write("         <tr height=\"25px\"><td width=\"170px\"><input type=\"text\" name=\"userid\" required autofocus></td>\r\n");
      out.write("            <td width=\"50px\" rowspan=\"2\">\r\n");
      out.write("            <input type=\"submit\" value=\"로그인\" style=\"width:55px; height:45px; background:pink; color:navy; margin:0px; padding:0px;\"></td></tr>\r\n");
      out.write("         <tr height=\"25px\"><td><input type=\"password\" name=\"userpwd\" required autofocus></td></tr>\r\n");
      out.write("         <tr height=\"35px\">\r\n");
      out.write("            <td colspan=\"2\"><a href=\"views/member/enroll.html\"><font size=\"2\">회원가입</font></a> &nbsp; <A><font size=\"2\">아이디/암호 분실시</font></A></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("   </form>\r\n");
      out.write("   ");
 } else {
      out.write("\r\n");
      out.write("      <form action=\"\">\r\n");
      out.write("      <table width=\"220px\" height=\"85px\">   <!-- 서버쪽에선 반드시 name이 필요하다!!! -->\r\n");
      out.write("         <tr height=\"25px\">\r\n");
      out.write("         \t<td width=\"170px\"> ");
      out.print( loginUser.getUserName() );
      out.write("님</td>\r\n");
      out.write("         \t<td width=\"80\">         \t\t\r\n");
      out.write("         \t\t<a href=\"/first/logout\"><input type=\"button\" value=\"로그아웃\" style=\"width:55px; height:45px; background:pink; color:navy; margin:0px; padding:0px;\"></a>\r\n");
      out.write("         \t</td>\r\n");
      out.write("         \t</tr>\r\n");
      out.write("         \r\n");
      out.write("         <tr height=\"25px\">\r\n");
      out.write("         \t<!-- 쿼리 스트링 : a 태그에서 사용함, 컨트롤러에게 전송할 값 지정\r\n");
      out.write("         \t\thref=\"대상이름?이름=전송값/값이 여러개 일 경우 구분자는 &\r\n");
      out.write("         \t\tex) 이름=값&이름=값&이름=값...\r\n");
      out.write("         \t\ta 태그는 전송방식이 무조건 get이다. -->\r\n");
      out.write("            <td><a href=\"/first/mdetail?userid=");
      out.print( loginUser.getUserId() );
      out.write("\">내 정보 보기</a></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("   </form>\r\n");
      out.write("   \r\n");
      out.write("   ");
 } 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <hr style=\"clear:both;\"> <br>\r\n");
      out.write("   \r\n");
      out.write("   ");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
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
