<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member"%>
    
    <%
    
    //일반적인 자바 소스 코드가 작성되는 영역임 : 스크립트릿 태그
    Member loginUser = (Member)session.getAttribute("loginUser");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first</title>
<link href="resources/css/header.css" rel="stylesheet" type="text/css">
</head>
<body>

	<% if(loginUser != null && loginUser.getUserId().equals("admin")) {%>
		<%@ include file="adminHeader.jsp" %>
	<% } else { %>
		<%@ include file ="header.jsp" %>
	<% } %>	
	
	<hr style="clear:both;">
   <div id="banner" style="margin-left:40px; float:left; margin-right:15px;">
      <img src="resources/images/무한극장.gif" width="520px" height="150px">
   </div>
   
   <%-- JSP 주석 태그 --%>
   <%-- action: 폼의 입력값을 전송받을 서버쪽 컨트롤러의 이름 --%>
   <%
   
   		if(loginUser == null) {
   
   %>
   <form action="login" method="post">
      <table width="220px" height="85px">   <!-- 서버쪽에선 반드시 name이 필요하다!!! -->
         <tr height="25px"><td width="170px"><input type="text" name="userid" required autofocus></td>
            <td width="50px" rowspan="2">
            <input type="submit" value="로그인" style="width:55px; height:45px; background:pink; color:navy; margin:0px; padding:0px;"></td></tr>
         <tr height="25px"><td><input type="password" name="userpwd" required autofocus></td></tr>
         <tr height="35px">
            <td colspan="2"><a href="views/member/enroll.html"><font size="2">회원가입</font></a> &nbsp; <A><font size="2">아이디/암호 분실시</font></A></td>
         </tr>
      </table>
   </form>
   <% } else {%>
      <form action="">
      <table width="220px" height="85px">   <!-- 서버쪽에선 반드시 name이 필요하다!!! -->
         <tr height="25px">
         	<td width="170px"> <%= loginUser.getUserName() %>님</td>
         	<td width="80">         		
         		<a href="/first/logout"><input type="button" value="로그아웃" style="width:55px; height:45px; background:pink; color:navy; margin:0px; padding:0px;"></a>
         	</td>
         	</tr>
         
         <tr height="25px">
         	<!-- 쿼리 스트링 : a 태그에서 사용함, 컨트롤러에게 전송할 값 지정
         		href="대상이름?이름=전송값/값이 여러개 일 경우 구분자는 &
         		ex) 이름=값&이름=값&이름=값...
         		a 태그는 전송방식이 무조건 get이다. -->
            <td><a href="/first/mdetail?userid=<%= loginUser.getUserId() %>">내 정보 보기</a></td>
            <td>&nbsp;</td>
         </tr>
      </table>
   </form>
   
   <% } %>
   
   <hr style="clear:both;"> <br>
   
   <%@ include file= "footer.html" %>
	
	
</body>
</html>