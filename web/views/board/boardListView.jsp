<%@page import="javax.swing.border.Border"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="./boardError.jsp"%>
    <%@ page import="member.model.vo.Member, board.model.vo.Board, java.util.ArrayList, java.sql.Date" %>
   <%
   	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
  	int listCount=((Integer)request.getAttribute("listCount")).intValue();
    int currentPage=((Integer)request.getAttribute("currentPage")).intValue();
    int maxPage=((Integer)request.getAttribute("maxPage")).intValue();
    int startPage=((Integer)request.getAttribute("startPage")).intValue();
    int endPage=((Integer)request.getAttribute("endPage")).intValue();
    Member loginUser=(Member)session.getAttribute("loginUser");
    
   %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function showWriteForm(){
	location.href="views/board/boardWriteForm.jsp?userid=<%=loginUser.getUserId()%>";	
}

</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../../header.jsp" %>
<hr Style="clear:both;">
<h2 align="center">게시글 목록</h2>
<h4 align="center">총 게시글 갯수: <%= listCount %></h4>
<%if(loginUser!=null){ %>
<div Style="align:center; text-align:center">
<button onclick="showWriteForm();">글쓰기</button>
</div>
<%} %>



<br>
<table align="center" border="1" cellspacing="0" width="700">
<tr><th>번호</th><th>제목</th><th>작성자</th><th>날자</th><th>조회수</th><th>첨부파일</th></tr>
<%for(Board b:list){ %>
<tr>
	<td align="center"><%=b.getBoardNum() %></td>
	<td>   <% if(b.getBoardReplyLev()==1){ %>
	&nbsp;&nbsp; >
	<%}else if(b.getBoardReplyLev()==2){ %>
	&nbsp;&nbsp;&nbsp;&nbsp; >>
	<%} %>
	<!-- 로그인 한 상태일때만 상세보기 링크처리 -->
	<% if(loginUser!=null){ %>
	<a href="/first/bdetail?bnum=<%=b.getBoardNum()%>&page=<%=currentPage%>"><%=b.getBoardTitle() %></a>
	<%} %>
	</td>
	<td><%=b.getBoardWriter() %></td>
	<td><%=b.getBoardDate() %></td>
	<td><%=b.getBoardReadCount() %></td>
	<td><% if(b.getBoardOriginalFileName()!=null){ %>
	◎
	<%}else{ %>
	&nbsp;
	<%} %>
	</td> 
	
	
</tr>
<%}//for종료 %>
</table>
<!-- 페이징 처리 -->
<div style="text-align: center">

<% if(currentPage<=1){ %>
[맨처음]&nbsp;
<%}else{ %>
<a href="/first/blist?page=1">[맨처음]</a>
<%} %>


<% if((currentPage-10)>=startPage && (currentPage-10)>1){ %>
<a href="/first/blist?page=<%=startPage-10 %>">[prev]</a>


<%}else{ %>
[prev]&nbsp;
<%}%>


<%for(int p= startPage; p<=endPage; p++){ 
		
	if(p==currentPage){%>
		
		<font color="red" size="4">[<%=p%>]</font>
		
		<%}else{ %>
		
		<a href="/first/blist?page=<%= p %>"><%= p %></a>
		
<%}} %>


<% if((currentPage+10)<=endPage && (currentPage+10)< maxPage ){ %>
<a href="/first/blist?page=<%=endPage+10 %>">[Next]</a>
<%}else{ %>
[Next]&nbsp;
<%} %>

<% if(currentPage>=maxPage){ %>
[맨끝]&nbsp;
<%}else{ %>
<a href="/first/blist?page=<%=maxPage%>">[맨끝]</a>
<%} %>



</div>
<hr>
<%@ include file="../../footer.html" %>
</body>
</html>