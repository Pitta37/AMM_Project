<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Pittau Marco">
        <meta name="keywords" content="BachecaNerdBook Nerbook Bacheca">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <c:set var="page" value="bacheca" scope="request"/>
        <jsp:include page="nav.jsp"/>
       
        <div id="divBody">
            <div id="info">
                <div id="persone">
                    <h2>Persone</h2>
                        <ul>
                            <c:forEach var="n" items="${user}">
                            <li>${n.username}</li>
                        </ul>
                    </c:forEach>
                </div>
                
                <div id="gruppi">
                    <h2>Gruppi</h2>
                    <ul>
                        <c:forEach var="n" items="${gruppo}">
                            <li>${n.nome}</li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
           
                    
            <div id="posts">
                <c:forEach var="post" items="${posts}">
                    <div class="post">
                        <c:if test="${post.tipoPost == 'TEXT'}">
                            <p>${post.contenuto}</p>
                        </c:if>
                        <c:if test="${post.postType == 'IMAGE'}">
                            <img alt="Post con foto" src="${post.contenuto}">
                        </c:if>
                    </div>
                </c:forEach>
            </div>
        </div>        
    </body>
</html>
