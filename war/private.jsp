 
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
    <body>
    	<div style="font-weight: bold;">ユーザー：<%=user.getNickname() %></div>
    	<br>
        <h1>パンケーキにトッピングするものを選んでください(250円)</h1>
        <h2>ベースのパンケーキは600円です。</h2>
        <br>
        <a href ="/cart">カートの中身を確認へ</a>
        <a href="/logout">Logout</a>
    </body>
</html>