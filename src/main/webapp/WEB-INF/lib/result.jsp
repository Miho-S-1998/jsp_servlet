<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<h1>確認画面</h1>
<form action="finish" method="post">
<%String article=(String)request.getAttribute("article");%>
<label for="article">入力した値は、これですね？:<%=article %></label>

<p></p>
<button type="submit">完了画面へ</button>
</form>
</body>
</html>