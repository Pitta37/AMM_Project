<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Pittau Marco">
        <meta name="keywords" content="LoginNerdbook Login NerdBook">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <c:set var="page" value="login" scope="request"/>
        <jsp:include page="nav.jsp"/>
        
        <div id="formLogin">
            <form action="Login" method="post">
                <div id="internDivForm">
                    <c:if test="${invalidData == true}">
                        <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
                    </c:if>
                    <c:if test="${loginFirst == true}">
                        <div id="invalidDataWarning">Prima effettuare il login</div>
                    </c:if>
                    <p>Inserisci le tue credenziali</p>
                    <label for="user">Username:</label>
                    <input name="user" id="user" type="text"/>
                    <label for="psw">Password:</label>
                    <input name="psw" id="psw" type="password"/>
                    <button class="submit" type="submit">Invia</button>                            
                </div>     
            </form>
        </div>
    </body>
</html>
