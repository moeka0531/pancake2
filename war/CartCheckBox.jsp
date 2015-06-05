
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pancake Cart</title>
    </head>
    <body>
    	<Div Align="center">
    	<br>
    	<br>
        <h1>カート内の商品は以下の通りです。</h1>
        <h2>品名　　　金額</h2>
        <hr size="10">
        <h4>パンケーキ　600</h4>

        <hr size="10">
        <h4>合計金額　 600        円</h4>
        
        <form action="thankyou.jsp" method="post" class="thankyou">
            <input type="submit" value="この内容で注文する" />
        </form>
        <br>
		<a href="/logout">Logout</a>
		</Div>
    </body>
</html>