<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">

body{
margin:0;
font-family:sans-serif;
background-image:url('login.jpg');
background-position:center;
background-size:cover;
background-repeat:no-repeat;

}
.site-header{
background-color:rgba(0,0,0,0.6);
padding:30px;
margin:auto;
margin-top:100px;
height:350px;
width:400px;
text-align:center;
border-radius:5%;
color:pink;

}
.site-header label{
text-size:3em;
color:pink;
display:flex;

}
.site-header p{
text-size:3em;
color:pink;
}

.site-header input[type="text"],
.site-header input[type="password"]
{
height:30px;
width:200px;
border-radius:10% 10% 10% 10%; 

}

.site-header input[type="submit"]
{
height:40px;
width:120px;
background-color:pink;
}
.site-header input[type="submit"]:hover
{
background-color:orange;


}

</style>
</head>
<body>
<form>
<%@ include file="header.jsp" %>
<div class="site-header">
<p>Welcome to Login Page</p>
<h3><center>Login</center></h3>
<br>
<label>MailId :</label>
<input type="text" name="mail" id="mail" placeholder="enter the mailid" required>
<br>
<label>Password :</label>
<input type="password" name="pass" id="pass" placeholder="enter the password" required>
<br>
<br>
<input type="submit" value="Login">
<br>
<p>You dont Have Account ?<a href="Signup.jsp">signup</a></p>

</div>

</form>
</body>
<%@ include file="footer.jsp" %>
</html>