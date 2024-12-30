<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup Page</title>
<style type="text/css">

body {
  margin: 0;
  font-family: sans-serif;
  background-image: url('hotel1.jpg'); 
  background-size: cover; 
  background-position: center; 
  background-repeat: no-repeat;
  
}


.site-header {
  text-align: center;
  padding: 20px ;
  background-color: rgba(0, 0, 0, 0.5); 
  height:532px;
  width:500px;
  margin:auto;
  margin-top:40px;
  border-radius:10% 10% 10% 10%;
  color: pink; 
}


.site-header h3 {
  font-size: 1em;
  margin: 0;
}
.site-header p {
  font-size: 1em;
  margin: 0;
  color:white;
}
.site-header label{
display:flex;
text-align:left;
color:pink;

}
.site-header input[type="text"],
.site-header input[type="password"]
{
border:1px solid #ccc;
height:20px;
width:200px;
padding:10px;
border-radius:5%;
font-size:1em;
}

.site-header input[type="submit"]
{
height:40px;
width:150px;
background-color:pink;
}

.site-header input[type="submit"]:hover{
background-color:orange;
}


</style>
</head>
<body>
<form>
<%@ include file="header.jsp" %>

<div class="site-header">
<h3><i>Welcome to Hotel Application</i></h3>
 <Center><h2>Sign Up</h2></Center>
 <br>
 <div>
 <label>Name :</label>
 <input type="text" name="user" id="user" placeholder="enter the username" required>
 <br>
 <br>
 <label>Phone :</label>
 <input type="text" name="phone" id="phone" placeholder="enter the phonenum" required>
 <br>
 <br>
 <label> Email :</label>
 <input type="text" name="mail" id="mail" placeholder="enter the mailid" required>
 <br>
 <br>
 <label>password :</label>
 <input type="password" name="pass" id="pass" placeholder="enter the password" required>
 <br>
 <br>
 <label>Confirmpass :</label>
 <input type="password" name="cpass" id="cpass" placeholder="enter the conpass" required>
 <br>
 <br>
 <input type="submit" value="Register" >
 <p>If you have Already Account ?<a href="Login.jsp">Login</a></p>
 
 </div>
 </div>
 <%@ include file="footer.jsp" %>
</form>
</body>
</html>