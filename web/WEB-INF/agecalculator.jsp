<%-- 
    Document   : ageCalculator
    Created on : Sep 25, 2022, 7:05:54 PM
    Author     : User
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
            Enter Your Age: <input type="number" name="age" value="${age}"><br>
            <input type="submit" value="Submit">
        </form>
            
        <p>${message}</p>
        
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
