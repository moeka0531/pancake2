
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pancake Cart</title>
    </head>
    <body background = "./background3.jpg">
    	<Div Align="center">
    	<br>
    	<br>
        <h2>カート内の商品は以下の通りです＊</h2>
        <h2>品名　　　金額</h2>
        <hr size="10">
        <h4>パンケーキ　600</h4>

        <hr size="10">
        <h4>合計金額　 600        円</h4>
        <br>
        <br>
        <br>
        続いて配送設定を行います、以下のボタンを押して進んでください！
        <br>
        <br>
        <form action="delivery.jsp" method="get" class="delivery">
            <input type="submit" value="配送設定へ" />
        </form>
        <br>
		<a href="/logout">Logout</a>
		</Div>
    </body>
</html>