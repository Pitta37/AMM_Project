<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="divBody">
    <div id="info">
        <div id="persone">
            <h2>Persone</h2>
            <ul>
                <c:forEach var="n" items="${nPersone}">
                    <li>${n}</li>
                </c:forEach>
            </ul>
        </div>
                
        <div id="gruppi">
            <h2>Gruppi</h2>
            <ul>
                <c:forEach var="x" items="${nGruppi}">
                    <li>${x}</li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
