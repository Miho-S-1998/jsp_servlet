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
<%String article=(String)request.getAttribute("article");%>
<p>「<%=article %>」を登録しました。</p>
<p></p>
<a href="form">入力画面へ</a>
</form>
</body>
</html>