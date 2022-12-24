<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<body>
    <%@include file="navbar.html" %>
        <br>

        <div class=container>
            <div class="card m-5 p-2">
                <div class="card-header">
                    <h2>product details</h2>
                </div>
                <div class="card-body">
                    <form action="/productapi/product" method=post>

                        <input type="hidden" name="id"  id="id"  value="${product.id}"  >
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
                            <input type="number" class="form-control" id="quantity" name="quantity"
                                value="${product.quantity}">
                        </div>


                        <div class="mb-3">
                            <label for="Category" class="form-label">Category:</label>
                            <select name="categoryId">
                                <c:forEach items="${listCategory}" var="category">
                                    <c:if test="${product.category.id == category.id}"><option value="${category.id}" selected >${category.name}</option></c:if>
                                    <c:if test="${product.category.id != category.id}"><option value="${category.id}"          >${category.name}</option></c:if>
                                </c:forEach>
                            </select>

                        </div>


                        <label class="form-label"> photo </label>
                        <br>
                        <img src="/productapi/images/${product.picture}"  width="50" height="50" />
                        <button type="submit" class="btn btn-primary">Save</button>
                    </form>
                </div>
            </div>
        </div>
</body>