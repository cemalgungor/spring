<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>

	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">

	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">

	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">

	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">

	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">

	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">

	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">

	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<script> 
          
            // Function to check Whether both passwords 
           
            function checkPassword(form) { 
                password1 = form.pwd.value; 
                password2 = form.pwd1.value; 
  
               
                if (password1 == '') 
                    alert ("Please enter Password"); 
                      
                
                else if (password2 == '') 
                    alert ("Please enter confirm password"); 
                      
                   
                else if (password1 != password2) { 
                    alert ("\nPassword did not match: Please try again...") 
                    return false; 
                } 
  
                
                else{ 
                    
                    return true; 
                } 
            } 
        </script> 
</head>
<body>
<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
     <!-- User input form to validate a user -->
            <c:url var="registiration" value="/user/registiration" />
            <form   onSubmit = "return checkPassword(this)" class="login100-form validate-form" id="reg_form" action="registiration" method="POST">
            <span class="login100-form-title p-b-26">
						Register Page
					</span>
					<span class="login100-form-title p-b-48">
						<i class="zmdi zmdi-font"></i>
					</span>
                <div  class="wrap-input100 validate-input" >
                  
                    <input type="text"  class="input100" id="name" name="username"  maxlength="6">
                    <span class="focus-input100" data-placeholder="username"></span>
                </div>
                <div  class="wrap-input100 validate-input"  class="wrap-input100 validate-input">
                <span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
                 
                    <input type="password"class="input100" id="pwd"  name="password"  maxlength="6">
                    <span class="focus-input100" data-placeholder="Password"></span>
                </div>
                <div  class="wrap-input100 validate-input"  class="wrap-input100 validate-input">
                <span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
                 
                    <input type="password"class="input100" id="pwd1"  name="password1"  maxlength="6">
                    <span class="focus-input100" data-placeholder="Password"></span>
                </div>
          	<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
                <button id="confirm_user" type="submit" class="login100-form-btn">Register </button>
                			</div>
					</div>
					
            </form>
        	</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
</body>
</html>