 
<%@ page language="java" contentType="text/html; charset=utf8"
        pageEncoding="utf8" %>
<%@page import="java.util.*, java.io.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type"
            content="text/html; charset=utf-8">
        <title>配送設定</title>
    </head>
   	<body background = "./background3.jpg" >
    	<Div Align="center">
    	<br>
    	<br>
    	<h1>配送日時を設定します</h1>
    	<br>
    	<h3>(1)日付を設定してください</h3>
    	<select name = "dday">
    	<option> 当日中 </option>
    	<option> 明日 </option>
    	<option> あさって </option>
    	<option> 明々後日 </option>
    	</select>
  		<br>
  		<br>
    	
    	<h3>(2)時間を設定してください</h3>
        <input type="radio" name="dtime" value="0" checked />午前中(9:00-11:00)
		<br>
		<input type="radio" name="dtime" value="1" />お昼(12:00-15:00)
		<br>
		<input type="radio" name="dtime" value="2" />夕方(16:00-18:00)
		<br>
		<input type="radio" name="dtime" value="3" />夜(19:00-21:00)
		<br>
		<br>
		<h3>(3)その他何か伝えたいことがあればこちらにお書きください</h3>
		<textarea name="comment" rows="8" cols="50">
		</textarea>		　
        <br>
        <br>
        <br>
        <a href ="/deliverycheck">最終確認へ</a>
        <br> 
        <a href="/logout">Logout</a>
        </Div>
    </body>
</html>