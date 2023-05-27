<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="login" method="get">
   
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
         
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
                
                <p id="ad"></p>
                
            
			<button onclick="wrng()">LogIn</button>           
<script type="text/javascript">
function wrng(){
var msg=document.getElementById('ad');
var inpwd=document.getElementById('ad').value;
var dbpwd=
}

</script>
</form>

</body>
</html>