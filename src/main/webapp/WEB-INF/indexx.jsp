<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
*{
margin:0;
padding:0;
}

body{
background:url("https://c0.wallpaperflare.com/preview/140/698/423/security-computer-web-virus.jpg");
background-size:95%;
background-position: -400px 0px;
}
div.main{
	width:400px;
	margin: 100px auto 0px auto;
}
h2{
text-align: center;
padding: 20px;
font-family: sans-serif;

}
div.register{
	background-color: rgba(0,0,0,0.5);
	width: 100%;
	font-size: 18px;
	border-radius: 10px;
	border:1px solid rgba(255,255,255,0.3);
	box-shadow:2px 2px 15px 
	rgba(0,0,0,0.3);
	color: #fff;
}
form#register{

margin:40px;
}
label{
font-family:sans-serif;
font-size:18px;
font-style:italic;
}
input#name{
width:300px;
border:1px solid #ddd;
border-radius: 3px;
outline:0;
padding:7px;
background-color:#fff;
box-shadow: inset 1px 1px 5px
rgba(0,0,0,0.3);
}

input#submit{
width:200px;
padding:7px;
font-size:16px;
font-family:sans-serif;
font-weight:600;
border:none;
border-radius:3px;
background-color:rgba(250,100,0,0.3);
color:#fff;
cursor:pointer;
border:1px solid rgba(255,255,255,0.3);
box-shadow:1px 1px 5px
rgba(0,0,0,0.3);
margin-bottom:20px;
}
#ychu{
color: white;

}
</style>
</head>
<body>
<div class="main">
    <div class="register">
  <h2>Admin Login Here</h2>
  

<br><br>
<form action="submit" method="post" >
<label> Email Address :</label>
  <br>
  <input type="text" name="email" id="name" required="required">
  <br><br>
  
  <label> Password :</label>
  <br>
  <input type="text" name="pass" id="name" required="required">
  <br><br>
  
  
    <input type="submit" value="submit"
  name="submit" id="submit"  >
  <br><br>
  <a href="register" id="ychu"><b>Create new Admin Account?</b></a>
  </form>
  </div>
  </div>
</body>
</html>