<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
 	out.println("<p>includeFrom.jsp파일의 내용입니다 </p>");
	pageContext.include("includesub.jsp");
 	
 	
%>

</body>
</html>