<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="style.css" media="screen">

 <header id="headDescr">
    <div>
        <h1>NerdBook</h1>
    </div>
</header>
<nav id="navDescr">             
        <ol>
            <li
                <c:if test="${page=='descrizione'}">
                    class="active"
                </c:if>>
                <a href="descrizione.jsp">Descrizione</a>
            </li>
            <li 
                <c:if test="${page=='login'}">
                    class="active"
                </c:if>>
                <a href="login.jsp">Login</a>
            </li>
            <li 
                <c:if test="${page=='profilo'}">
                    class="active"
                </c:if>>
                <a href="profilo.jsp">Profilo</a>
            </li>
            <li 
                <c:if test="${page=='bacheca'}">
                    class="active"
                </c:if>>
                <a href="bacheca.jsp">Bacheca</a>
            </li>
        </ol>
</nav>  