
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <jsp:include page="ColonnaLateraleSx.jsp"/>
        <c:set var="dest" value="${idBacheca}" scope="request"/>
        <jsp:include page="NuovoPost.jsp"/>
        <div>            
                <div class="Post">
                    <img alt="fotoProfilo" src="Img/icon.jpg" id="imgAnteprima">
                    <h3>Mario Rossi</h3>
                    <p>Oggi è una bellissima giornata! Giocherò a calcio al pc!</p>                    
                </div>
                <div class="Post">
                    <img alt="fotoProfilo" src="Img/icon2s.jpg" id="imgAnteprima">
                    <h3>Luigi Serra</h3>
                    <p>Foto scattata a Montevecchio</p>
                    <p><img alt="fotoProfilo" src="Img/img.jpg"></p>              
                </div>
                <div class="Post">
                    <img alt="fotoProfilo" src="Img/icon3.png" id="imgAnteprima">
                    <h3>Franco Di Franco</h3>
                    <p>Che bel motore di ricerca! Altro che Yahoo! <a href="http://www.google.it" target="_blank">Provalo!</a></p>              
                </div>
                       
        </div>        
    </body>
</html>
