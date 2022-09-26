<%-- 
    Document   : ArithmeticCalculator
    Created on : 25-Sep-2022, 2:44:28 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
       <form method="post" action="arithmetic">
           First:<input type="text" name="first"><br> <br>
           Second:<input type="text" name="second"><br> <br>
                <input type="submit" name="sign" value="+">
                <input type="submit" name="sign" value="-">
                <input type="submit" name="sign" value="*">
                <input type="submit" name="sign" value="%">
       </form>
        Result: ${answer}
        <br><a href="age"> Age Calculator </a> 
    </body>
</html>
