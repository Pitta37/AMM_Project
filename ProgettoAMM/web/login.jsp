<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <c:if test="${invalidData=='true'}">
                    <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
        </c:if>
                    
        <div id="divBody">
            <div id="provaHack">                
                <a href="bacheca.html"><img id="picNerd" src="Img/enne.png" alt="Foto Nerdbook"></a>
                <h1>NerdBook</h1>
            </div>
            
            <div id="formLogin">
                <form action="Login" method="post">
                    <div id="internDivForm">
                        <c:if test="${invalidData=='true'}">
                            <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
                        </c:if>
                        <label for="user">Username:</label>
                        <input name="user" id="user" type="text"/>
                        <label for="psw">Password:</label>
                        <input name="psw" id="psw" type="password"/>
                        <button class="submit" type="submit">Invia</button>                            
                    </div>                                      
                </form>
            </div>
        </div>
    </body>
</html>
