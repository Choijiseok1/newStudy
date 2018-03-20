<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.model.vo.*"%>
    <%
    Board bo=(Board)request.getAttribute("Board");
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
글쓴이=<%=bo.getBoardWriter() %><br>
날짜=<%=bo.getBoardDate() %><br>
내용=<%=bo.getBoardContent() %><br>
</body>
</html>