<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Pittau Marco">
        <meta name="keywords" content="ProfiloNerdBook NerdBook Profilo">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <c:set var="page" value="profilo" scope="request"/>
        <jsp:include page="nav.jsp"/>
          
        <div>
            <div id="divProfile">
                <img src="Img/user.png" alt="Foto Profilo" id="imgProfilo">
                <div id="formProfile">
                    <form action="#" method="post">
                        <div class="inputLabel">
                            <label for="nome">Nome</label>
                            <input name="nome" id="nome" type="text"/>                            
                        </div>
                        
                        <div class="inputLabel">
                            <label for="cognome">Cognome</label>
                            <input name="cognome" id="cognome" type="text"/>
                        </div>
                        
                        <div class="inputLabel">
                            <label for="url">URL</label>
                            <input type="url" name="url" id="url">
                        </div>
                        
                        <div class="inputLabel">
                            <label for="textbox">Frase di presentazione</label>
                            <textarea name="textbox" id="textbox" ></textarea>
                            <!--<input type="text" name="textbox" id="textbox">-->
                        </div>
                        
                        <div class="inputLabel">
                            <label for="data">Data di nascita</label>
                            <input name="data" id="data" type="date"/>
                        </div>
                        
                        <div class="inputLabel">
                            <label for="psw">Password</label>
                            <input name="psw" id="psw" type="password"/>
                        </div>
                        
                        <div class="inputLabel">
                            <label for="confirmpsw">Conferma Password</label>
                            <input name="confirmpsw" id="confirmpsw" type="password"/>                            
                        </div>   
                    
                        <button class="submit" type="submit">Aggiorna</button>                 
                    </form>
                </div>
                
            </div>

        </div>
    </body>
</html>
