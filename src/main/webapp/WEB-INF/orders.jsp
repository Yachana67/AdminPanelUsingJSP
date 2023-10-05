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

<h1 class="text-center mb-6"> Orders</h1>
<h1>Welcome!! ${email}</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <!--  style="padding-left:346px-->
      <th scope="col">ORDER ID</th>
     
      <th scope="col">User ID</th>
        <th scope="col">Address ID</th>
    
      
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${userOrders}" var="o">
    <tr>

     
      <td>${o.order_id }</td>
      
      
      <td>${o.user_id }</td>
      <td>${o.address_id }</td>
      <td>
      <a href="delete/${o.id }"><i class="fa-solid fa-trash text-danger"></i></a>
      <a href="update/${o.id }"><i class="fas fa-pen-nib text-primary"></i></a>

      
      
      </td>
      
    </tr>
    </c:forEach>
    
  </tbody>
</table>
<div class="container text-center">


<a href="logout" class="btn btn-outline-danger">Logout</a>
</div>
</div>



</div>

</div>
</body>
</html>
