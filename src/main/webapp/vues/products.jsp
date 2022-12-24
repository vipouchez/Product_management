<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<%@include file="navbar.html"%>
<br><br>
<form method=get action=productmc>
<div class=container>
<div class="row mt-4 pl-2">
<div class="col-md-1">
<label for="mc" class="form-label">Mot Cle:</label>
</div>
<div class="col-md-3">
<input type="text" id="mc" class="form-control" name=mc>
</div>
<div class="col-md-3">
<button type="submit" class="btn btn-primary">Search</button>
</div> </div> </div> </form>
<br><hr>
<table class="table table-hover">
<tr>
 <th>Id</th><th>Name</th><th>Price</th><th>Quantity</th><th>Categorie</th><th>Picture</th><th>Action</th>
</tr>
<c:forEach items="${products}" var="p">
<tr>
<td>${p.id}</td>
<td>${p.name}</td>
<td>${p.price }</td>
<td>${p.quantity}</td>
<td>${p.category.name}</td>
<td> <img src="/productapi/images/${p.picture}"  width="50" height="50" /> </td>
<td> <form action="deleteproduct/${p.id}" method="post">
         <button type="submit" class="btn btn-primary">Delete</button></form>
         <a href="/productapi/product/${p.id}" class="btn btn-primary" > update </a>
</td>

</tr>
</c:forEach>
</table>
</body>
