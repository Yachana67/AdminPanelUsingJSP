<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  <!DOCTYPE html>


<html>
<head>
</head>
<body>

<div class="container mt-3">
<div class="row">
<div class="col-md-12">

<h1 class="text-center mb-6"> Products</h1>
<h1>Welcome!! ${email}</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <!--  style="padding-left:346px-->
      <th scope="col">Image</th>
      <th scope="col" >PRODUCT NAME</th>
      <th scope="col">DESCRIPTION</th>
      <th scope="col">PRICE</th>
      
       <th scope="col">ACTION</th>
      
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${products}" var="p">
    <tr>
     <td> 
     <img src="${pageContext.request.contextPath}/images/${p.id}" alt="Image" width="100" height="100">
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td class="font-weight-bold">&#8377 ${p.price }</td>
     
      <td>
      <a href="delete/${p.id }"><i class="fa-solid fa-trash text-danger"></i></a>
      <a href="update/${p.id }"><i class="fas fa-pen-nib text-primary"></i></a>

      
      
      </td>
      
    </tr>
    </c:forEach>
    
  </tbody>
</table>
<div class="container text-center">

<a href="add" class="btn btn-outline-success">ADD Product</a>
<a href="index.jsp" class="btn btn-outline-danger">Logout</a>
</div>
</div>



</div>

</div>
</body>
</html>
