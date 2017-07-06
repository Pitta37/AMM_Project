<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header>
            <div>
                <h1>NerdBook</h1>
            </div>
            <link rel="stylesheet" type="text/css" href="style.css" media="screen">
</header>

<nav>            
        <ol>
            <li <c:if test="${page=='descrizione'}">class="active"</c:if>><a href="descrizione.jsp">Descrizione</a></li>
            <li <c:if test="${page=='login'}">class="active"</c:if>><a href="login.jsp">Login</a></li>
            <c:if test="!${page=='descrizione'}">
                <c:if test="!${page=='login'}">
                    <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="profilo.jsp">Profilo</a></li>
                    <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="bacheca.jsp">Profilo</a></li>
                    <div id="divLogout">
                        <h3> ${user.username} </h3>
                        <a href="Login?logout=true">Logout</a>                
                    </div>
                </c:if>
            </c:if>
        </ol>                
</nav>  
