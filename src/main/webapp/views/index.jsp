<!-- write boiler plate code jsp-->
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
    <h1>Hello World</h1>
    <form action="addAlien" method="post">
        Enter your id: <input type="text" name="aid"><br>
        Enter your name: <input type="text" name="aname"><br>
        <input type="submit" value="Add">
    </form>
    <hr>
    <form action="getAlien" method="get">
        Enter id: <input type="text" name="aid"><br>
        <input type="submit" value="Add">
    </form>
    <hr>
    <form action="getAlienByName" method="get">
        Enter name: <input type="text" name="aname"><br>
        <input type="submit" value="Add">
    </form>
</body>

</html>