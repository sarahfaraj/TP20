<%--
  Created by IntelliJ IDEA.
  User: sarah
  Date: 27/05/2019
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <title>Create livre</title>

</head>
<body>
<form action="./CreateLivreServlet" method="post" >
    <div class="form-group">

        <label >Auteur</label>
        <input type="text" class="form-control" id="idAuteur" placeholder="Auteur" name="auteur">
    </div>

    <div class="form-group">
        <label >Titre</label>
        <input type="text" class="form-control" id="idTitre" placeholder="Titre" name="titre">
    </div>

    <button type="submit" class="btn btn-primary">Ajouter</button>

</form>
<div class="form-group">
    <button  class="btn btn-primary" onclick="window.location.href='FindAllLivreServlet'"> Find_ALL</button>
</div>
</body>
</html>
