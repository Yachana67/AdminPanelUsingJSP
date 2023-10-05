<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Product</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-3">
        <h2 class="text-center">Update User</h2>
        
        <form action="/updateuSER/{id}/updateduser" method="post">
            <!-- Hidden input to capture the product ID -->
            <input type="hidden" name="id" value="${user.id}">
            
            <div class="form-group">
                <label for="name">User First Name:</label>
                <input type="text" class="form-control" id="name" name="f_name" value="${user.f_name}">
            </div>
            
            <div class="form-group">
                <label for="description">User Last Name:</label>
                <input type="text" class="form-control" id="description" name="l_name" value="${user.l_name}">
            </div>
            
            <div class="form-group">
                <label for="price">PHONE NUMBER:</label>
                <input type="number" class="form-control" id="price" name="phone_no" value="${user.phone_no}">
            </div>
            
             <div class="form-group">
                <label for="price">STATUS:</label>
                <input type="text" class="form-control" id="price" name="status" value="${user.status}">
            </div>
            
            <div class="form-group">
                <label for="price">Email:</label>
                <input type="text" class="form-control" id="price" name="email" value="${user.email}">
            </div>
            <!-- Add other form fields as needed -->

            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary">Update User</button>
            </div>
        </form>
        
        <div class="text-center mt-3">
            <a href="products" class="btn btn-secondary">Back to Products</a>
        </div>
    </div>
</body>
</html>