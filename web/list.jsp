<%--
  Created by IntelliJ IDEA.
  User: LENOVO1
  Date: 23/05/2019
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
          integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body >
<div class="margin">
<div class="container">

    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">Artiste</th>
            <th scope="col">Titre</th>
            <th scope="col">Duree</th>
            <th scope="col">Supprimer</th>
            <th scope="col">Modification</th>

        </tr>
        </thead>
            <c:forEach var="m" items="${listMusique}">
        <tbody>
        <tr>
            <td>${m.getArtiste()}</td>
            <td>${m.getTitre()}</td>
            <td>${m.getDuree()}</td>
            <td>
                <form action="DeleteServlet" method="post">
                <button type="submit" class="buttondelet" >
                    <input type="hidden" name="delet" value="${m.getId()}">
                    <i class="fas fa-trash-alt"></i>
                </button>
                </form>
            </td>
            <td>
                <form action="FindAllServlet" method="post">
                    <button type="submit" class="buttondelet" >
                        <input type="hidden" name="modif" value="${m.getId()}">
                        <i class="fas fa-dna"></i>
                    </button>
                </form>
            </td>

        </tr>
        <c:if test="${m.getId()==id}">
            <tr>
                <form action="ModifierServlet" method="post">
            <td><input type="text" class="form-control taille" name="artiste"  placeholder="Artiste"
                       value="${m.getArtiste()}"></td>
                <td><input  type="text" class="form-control taille " name="titre"  placeholder="Titre"
                            value="${m.getTitre()}"></td>
                <td><input  type="number" class="form-control taille" name="duree"  placeholder="Duree"
                            value="${m.getDuree()}"></td>
                <td>
                    <button type="submit" class="buttondelet" >
                        <input type="hidden" name="ok" value="${m.getId()}">
                        <i class="fas fa-thumbs-up"></i>
                    </button>
                    </td>
                </form>
            </tr>
                </c:if>
        </tbody>

            </c:forEach>
    </table>
</div></div></div>
<button class="btn btn-primary" onclick="window.location.href='./create.jsp'">Precedent</button>

</body>
</html>
