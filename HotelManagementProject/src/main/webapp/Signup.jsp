<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

 <script type = "text/javascript" src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
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
  height:535px;
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
#msg{
color:red;
}

</style>

 
            
</head>
<body>

<script>
jQuery.validator.addMethod("checkemail", function(value, element) {
    return /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(value) || /^[0-9]{10}$/.test(value);
});
jquery(document).ready(function($)
{
	$("Signup").validate({
		rules :{
			user :{
				required:true
			}
	        phone:{
	        	required:true,
			    minlength:10,
			    maxlength:10
	        	
	        }
			mail:{
				required:true,
				checkmail:true
	            			
			}
	        pass:{
	        	required:true,
	        	minlength:6,
	        	maxlength:6
	    
	        }
	       cpass:{
	    	   required:true,
	    	   minlength:6,
	    	   maxlength:6
	       } 
		},
	messages:{
		user:{
			required:"please enter the mail"
			
		}
		phone:{
			required:"please enter the phone number",
			minlength:"charecters are less than 10",
			maxlength:"charecters are more than 10"
		}
		mail:{
			required:"please enter the mailid",
			mail:"please enter the valid mailid"
		}
		pass:{
			required:"please enter the password",
			minlength:"charecters are less than 6",
			maxlength:"charecter are more than 6"
		}
		pass:{
			required:"please enter the password",
			minlength:"charecters are less than 6",
			maxlength:"charecter are more than 6"
		}
	}
		
	});
	
});
</script>
<form>
<%@ include file="header.jsp" %>

<div class="site-header">
<h3><i>Welcome to Hotel Application</i></h3>
 <Center><h2>Sign Up</h2></Center>
 <br>
  <% if (request.getAttribute("#") != null) {%>
        <div id="msg">  <%= request.getAttribute("#")%></div>
        <%}%>
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
 
</form>
<%@ include file="footer.jsp" %>
</body>
</html>