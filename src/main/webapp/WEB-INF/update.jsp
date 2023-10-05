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
        <h2 class="text-center">Update Product</h2>
        
        <form action="/update/{id}/handleup" method="post">
            <!-- Hidden input to capture the product ID -->
            <input type="hidden" name="id" value="${product.id}">
            
            <div class="form-group">
                <label for="name">Product Name:</label>
                <input type="text" class="form-control" id="name" name="name" value="${product.name}">
            </div>
            
            <div class="form-group">
                <label for="description">Product Description:</label>
                <input type="text" class="form-control" id="description" name="description" value="${product.description}">
            </div>
            
            <div class="form-group">
                <label for="price">Product Price:</label>
                <input type="number" class="form-control" id="price" name="price" value="${product.price}">
            </div>
            
            <!-- Add other form fields as needed -->

            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary">Update Product</button>
            </div>
        </form>
        
        <div class="text-center mt-3">
            <a href="products" class="btn btn-secondary">Back to Products</a>
        </div>
    </div>
</body>
</html>