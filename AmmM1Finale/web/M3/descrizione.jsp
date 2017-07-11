<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Pittau Marco">
        <meta name="keywords" content="descrizione del social network Nerdbook">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
       <c:set var="page" value="descrizione" scope="request"/>
       <jsp:include page="nav.jsp"/>
        <div>
            <h2>Il social più nerd del momento!</h2>
        </div>
        
        <div id="sommario">
            <h3>Domande frequenti</h3>            
        
            <div>
                <ol>
                    <li>
                        <a href="#domande">Domande</a>
                        <ul>
                            <li>
                                <a href="#quanto">Quanto mi costa?</a>
                            </li>
                            <li>
                                <a href="#cosa">Cosa troverò all'interno di nerdbook?</a>
                            </li>
                            <li>
                                <a href="#perche">Perchè devo iscrivermi su nerdbook?</a>
                            </li>
                            <li>
                                <a href="#legale">Siamo sicuri che sia legale questa cosa?</a>
                            </li>
                            <li>
                                <a href="#convinto">Ti abbiamo convinto?</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                       <a href="M3/login.jsp">Login</a>
                    </li>
                </ol>
            </div>
        </div>
         <div>
            <h2>Domande frequenti:</h2>
            <div id="quanto">
                <h3> Quanto mi costa?</h3>
                    <p >
                        Nerdbook è completamente gratis, per ora e per sempre,
                        i programmatori non hanno bisogno nè di cibo nè di acqua, si nutrono di luce e aria,
                        da cui grazie ad una proprietà di questi (non ancora capita dalla scienza) riescono a trasformarla in caffè
                    </p>
            </div>
            <div id="cosa">
                <h3>Cosa troverò all'interno di nerdbook?</h3>
                    <p >
                        All'interno di questo incredibile social troverai tanti post interessanti sulle tue passioni che accomunano i diversi utenti
                    </p>
            </div>            
            <div id="perche">
                <h3>Perchè devo iscrivermi su nerdbook?</h3>
                    <p >
                        Perchè è bello...<br>
                        No, non è vero, abbiamo rapito tua mamma, se la vuoi rivedere iscriviti e fai tutto quello che ti diciamo.
                    </p>
            </div>  
            <div id="legale">
                <h3>Siamo sicuri che sia legale questa cosa?</h3>
                    <p >
                        SIIIIIIIIIIIIIIIII<br>
                        L'ultimo che si è lamentato non si è fatto più vivo.
                    </p>
            </div>
            <div id="convinto">
                <h3>Ti abbiamo convinto?</h3>
                    <p >
                        Lo spero per tua mamma<br>
                        ps. Fà un ragù allucinante
                    </p>
            </div>
            <div>
                <h3>Non ti sei ancora iscritto?</h3>
                    <p>
                        Perchè stai leggendo ancora quì????<br>
                        Iscriviti. <a href="#registra">NOW...</a>
                        
                    </p>
            </div>
        </div>
        
    </body>
</html>
