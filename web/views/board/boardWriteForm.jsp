<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="./boardError.jsp" %>
    <% 
  	 String id=(String)request.getParameter("userid");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 Style="align=center">게시글 등록 페이지</h2>
<%@ include file="../../header.jsp" %>
<hr style="clear: both;">
<form action="/first/binst" method="post" enctype="multipart/form-data">
	<table align="center" width="600">
		<tr>
			<th>제목</th>			
			<td><input type="text" name="title" size="60"></td>			
		</tr>
		<tr>
			<th>작성자</th>			
			<td><input type="text" name="writer" value="<%=id%>" readonly></td>			
		</tr>
		<tr>
			<th>첨부 파일</th>
			<td><input type="file" name="upfile"></td>
		</tr>
		<tr>
			<th>내 용</th>			
			<td><textarea rows="5" cols="50" name="content"></textarea></td>			
		</tr>
		<tr>
			<th colspan = "2">			
			<input type = "submit" value="등록하기"> &nbsp;
				<input type = "reset" value="작성취소"> &nbsp;
				<input type = "button" value="이전 페이지로 이동"
				onclick = "history.go(-1); return false;">
			</th>
		</tr>
	</table>
</form>
<hr style="clear: both;">

<%@ include file="../../footer.html" %>
</body>
</html>