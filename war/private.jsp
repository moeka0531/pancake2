 
<%@ page language="java" contentType="text/html; charset=utf8"
        pageEncoding="utf8" %>
<%@ page import="com.google.appengine.api.users.*" %>
<%
User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type"
            content="text/html; charset=utf-8">
        <title>注文ページ</title>
    </head>
    <body background = "./background3.jpg">
    	<br>
    	<div style="font-weight: bold;">　ユーザー：<%=user.getNickname() %></div>
    	<br>
    	<Div Align="center">
    	<br>
    	<br>
        <h1><FONT face="Comic Sans MS">ようこそ PancakeWorkd へ！</FONT></h1>
        <br>
        <h2>パンケーキにトッピングするものを選んでください</h2>
        <h2>＊ベースのパンケーキは600円です＊</h2>
        <br>
        <h4>250円/1トッピング</h4>
        <input type="checkbox" name="q1" value="その1"> 桃　　
		<input type="checkbox" name="q1" value="その2"> パイナップル　　
		<input type="checkbox" name="q1" value="その3"> アイス　　 
		<input type="checkbox" name="q1" value="その4"> ミルクチョコレート　　
		<h4>300円/1トッピング</h4>
		<input type="checkbox" name="q1" value="その5"> 生クリーム<br>
		<br>
		<br>
        <form action="CartCheckBox.jsp" method="post" class="Cart">
        <p><input type="submit" value="注文確認へ"></p>
        <a href="/logout">Logout</a>
	</Div>
    </body>
</html>