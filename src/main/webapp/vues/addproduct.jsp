
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<%@include file="navbar.html" %>
<br>
<div class=container>
<div class="card m-5 p-2">
 <div class="card-header"><h2>Add product</h2></div>
<div class="card-body">
<form action="addproduct" method=post>

 <div class="mb-3 mt-3">
 <label for="name" class="form-label">Nom:</label>
 <input type=text class="form-control" id="name" name="name" value="${product.name}">
 </div>
 <div class="mb-3">
 <label for="price" class="form-label">Prix:</label>
 <input type="number" class="form-control" id="price" name="price" value="${product.price}">
 </div>
 <div class="mb-3">
 <label for="quantity" class="form-label">Quantity:</label>
 <input type="number" class="form-control" id="quantity" name="quantity" value="${product.quantity}">
 </div>


 <div class="mb-3">
  <label for="Category" class="form-label">Category:</label>
 <select name="category">
 <c:forEach items="${listCategory}" var="category">
 <option value="${category.id}">${category.name}</option>
 </c:forEach>
 </select>

  </div>



 <input type=hidden name=idp value="${product.id}">

 <button type="submit" class="btn btn-primary" >Save</button>
</form></div> </div></div></body>
