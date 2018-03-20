<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>

<%
	Member member = (Member)request.getAttribute("member");
	
	//취미 처리
	String[] hobbies = member.getHobby().split(",");
	String[] checked = new String[9];
	for(String s : hobbies) {
		switch(s) {		
		case "game": checked[0] = "checked"; break;
		case "reading": checked[1] = "checked"; break;
		case "music": checked[2] = "checked"; break;
		case "climb": checked[3] = "checked"; break;
		case "sport": checked[4] = "checked"; break;
		case "movie": checked[5] = "checked"; break;
		case "travel": checked[6] = "checked"; break;
		case "cook": checked[7] = "checked"; break;
		case "etc": checked[8] = "checked"; break;
		}
	}
	
%>

<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MemberDetailView</title>
<script type="text/javascript" src="/first/js/jquery-3.3.1.min.js"></script>

<script type="text/javascript">

$(function(){
	 
	   $('input[type=password]').blur(function(){		   
		   console.log("포커스 벗어남.");
		   var pwd1 = $("#upwd").val();
		   var pwd2 = $("#upwd2").val();
		
		if(pwd1 == pwd2) {			
			$("#confirm").css("display","true");
			$("#confirm").val("일치");		
		} else {
			$("#confirm").css("display","block");
			$("#confirm").val("불일치");			
		}
		   
	   }); 	   
});  

</script>
</head>
<body>

	<h2 align="center">내 정보 보기 페이지</h2>

	<form action="/first/mupdate" method="post">
		<!-- 상대경로 : ../../minsert -->
		<table width="650" align="center">
		
			<tr height="40">
				<th width="150">아이디</th>
				<td><input type="text" name="userid"
					value="<%= member.getUserId() %>" readonly></td>
			</tr>
			
			<tr height="40">
				<th width="150">이름</th>
				<td><input type="text" name="username"
					value="<%= member.getUserName() %>" readonly></td>
			</tr>
			
			<tr height="40">
				<th width="150">암 호</th>
				<td><input type="password" name="userpwd" id="upwd"
					value="<%= member.getUserPwd() %>"></td>
			</tr>
			
			<tr height="40">
				<th width="150">암호확인</th>
				<td><input type="password" id="upwd2"
					value="<%= member.getUserPwd() %>"></td>

			</tr>
			
			<tr height="40">
				<th width="150">암호확인 메세지</th>
				<td><input type="text" id="confirm" style="display: none"
					readonly></td>
			</tr>
			
			<tr height="40">
				<th width="150">성 별</th>
				<td>
					<% if(member.getGender().equals("M")) { %> <input type="radio"
					name="gender" value="M" checked>남 &nbsp; <input
					type="radio" name="gender" value="F">여 <% } else { %> <input
					type="radio" name="gender" value="M">남 &nbsp; <input
					type="radio" name="gender" value="F" checked>여 <% } %>

				</td>
			</tr>
			
			<tr height="40">
				<th width="150">나 이</th>
				<td><input type="number" name="age" min="20" max="100"
					value="<%= member.getAge() %>"></td>
			</tr>
			
			<tr height="40">
				<th width="150">이메일</th>
				<td><input type="email" name="email"
					value="<%= member.getEmail() %>"></td>
			</tr>
			
			<tr height="40">
				<th width="150">전화번호</th>
				<td><input type="tel" name="phone"
					value="<%= member.getPhone() %>"></td>
			</tr>
			
			<tr height="40">
				<th width="150">취 미</th>
				<td>
					<table>
						<tr>
							<td width="150"><input type="checkbox" name="hobby"
								value="game" <%= checked[0] %>>게임</td>
							<td width="150"><input type="checkbox" name="hobby"
								value="reding" <%= checked[1] %>>독서</td>
							<td width="150"><input type="checkbox" name="hobby"
								value="music" <%= checked[2] %>>음악</td>
						</tr>
						<tr>
							<td width="150"><input type="checkbox" name="hobby"
								value="climb" <%= checked[3] %>>등산</td>
							<td width="150"><input type="checkbox" name="hobby"
								value="sport" <%= checked[4] %>>운동</td>
							<td width="150"><input type="checkbox" name="hobby"
								value="movie" <%= checked[5] %>>영화</td>
						</tr>
						<tr>
							<td width="150"><input type="checkbox" name="hobby"
								value="travel" <%= checked[6] %>>여행</td>
							<td width="150"><input type="checkbox" name="hobby"
								value="cook" <%= checked[7] %>>요리</td>
							<td width="150"><input type="checkbox" name="hobby"
								value="etc" <%= checked[8] %>>기타</td>
						</tr>
					</table>
				</td>
			</tr>

			<tr height="40">
				<th width="150">특이사항</th>
				<td><textarea name="etc" rows="3" cols="50"><%= member.getEtc() %></textarea></td>
			</tr>

			<tr height="40">
				<th width="150" colspan="2"><input type="submit" value="수정하기">
					&nbsp; <a href="/first/mdelete?userid=<%= member.getUserId() %>">탈퇴하기</a>
					<a href="/first/index.jsp">시작페이지로</a></th>
			</tr>
		</table>
	</form>
	<%@ include file= "../../footer.html" %>
</body>
</html>