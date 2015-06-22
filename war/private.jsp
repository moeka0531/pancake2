 
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
        <input type="checkbox" name="q1" value="桃">桃　　
        <input type="checkbox" name="q1" value="生クリーム">生クリーム
		<input type="checkbox" name="q1" value="パイナップル">パイナップル　　
		<input type="checkbox" name="q1" value="アイス">アイス　　 
		<input type="checkbox" name="q1" value="ミルクチョコレート">ミルクチョコレート<br>　　

		<br>
        <br>
        <br>
        続いて配送設定を行います、以下のボタンを押して進んでください！
        <br>
        <br>
        <form action="delivery.jsp" method="get" class="Cart">
            <input type="submit" value="配送設定へ" />
        </form>
        <br>
        <br>
      	<a href="/add">トッピングについてのリクエストはこちらまで</a><br>
        <a href="/logout">Logout</a>
	</Div>
    </body>
</html>