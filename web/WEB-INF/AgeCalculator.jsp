<%-- 
    Document   : AgeCalculator
    Created on : 25-Sep-2022, 2:44:09 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
             <input type="text" name="initialAge"><br>
             <input type="submit" value="Age Next Birthday">       
             <p>${message}${age}</p>
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
