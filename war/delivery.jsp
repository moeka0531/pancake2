 
<%@ page language="java" contentType="text/html; charset=utf8"
        pageEncoding="utf8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type"
            content="text/html; charset=utf-8">
        <title>配送設定</title>
    </head>
    <body>
    	<h1>配送日時を設定します</h1>
        <input type="radio" name="dtime" value="0" checked />午前中(9:00-11:00)
		<br>
		<input type="radio" name="dtime" value="1" />お昼(12:00-15:00)
		<br>
		<input type="radio" name="dtime" value="2" />夕方(16:00-18:00)
		<br>
		<input type="radio" name="dtime" value="2" />夜(19:00-21:00)
		
		　
        <br>
        <a href ="/deliverycheck">配送設定確認へ</a>
        <a href="/logout">Logout</a>
    </body>
</html>