<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div>
            <div id="divProfile">
                <div id="formProfile">
                    <form action="Bacheca" method="post">
                        <c:if test="${msg}!=null">
                            ${msg}
                        </c:if>
                        <p>Scrivi sulla bacheca di ${dest}</p>
                        <div>
                            <label for="textType">Post di Testo</label>
                            <input type="radio" name="postType" value="Testo" checked="checked">
                        </div>
                        <div>
                            <label for="imgType">Post con Foto</label>
                            <input type="radio" name="postType" value="Immagine">
                        </div>
                        <div>
                            <label for="textType">Post con link</label>
                            <input type="radio" name="postType" value="Link">
                        </div>
                        <div>
                            <div>
                                <label for="textPost">Contenuto</label>
                                <textarea name="textPost" id="textPost"></textarea>
                            </div>
                        </div>
                        <input type="Hidden" name="destinatario" value="${dest}" >
                        <button type="submit" name="newPost" value="true">Invia</button>
                    </form>     
                    
                </div>
                
            </div>
</div>