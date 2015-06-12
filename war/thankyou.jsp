<%-- 
    Document   : thankyou
    Created on : 2013/12/09, 17:35:12
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>thank you!</title>
    </head>
    <body background = "./background3.jpg" >
    	<Div Align="center">
      	<br>
    	<br>
        <h1><FONT face="Comic Sans MS">Pancake World</FONT></h1>
        <h2>ご注文ありがとうございました！</h2>
       	<img src="./thankyou.jpg" width="500" height="400" alt=" "">
        <br><br>
        <form action="logout.do" method="post">
            <input type="submit" value="ログアウト" />
        </form>
        </Div>
</body>
</html>
