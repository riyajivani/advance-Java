<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <!-- getting this link from documantation materialize site -->
 <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    
</head>
<body style="background: url(img/bg.jpg); background-size: cover; background-attachment: fixed;">

	<div class="container">
	
		<div class="row">
		
			<div class="col m6 offset-m3">
			
				<div class="card">
			
					<div class="card-content">
						<h3 style="margin-top: 10px;" class="center-align">REGISTER HERE..</h3>
						
						<div class="form center-align">
							<!--creating form -->
							
							<form action="Register" method="post">
							<input type="text" name="username" placeholder="enter name here">
							<input type="password" name="userpassword" placeholder="enter password here">
							<input type="email" name="useremail" placeholder="enter email here">
							
							<button type="submit" class="btn">submit</button>
						
						</div>
						
						<div class="loader center-align" style="margin-top: 10px; display: none;">
						
 						<!-- search preloader on materialize css and copy the code -->	
 						
 											
						<div class="preloader-wrapper big active">
					      <div class="spinner-layer spinner-blue">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					
					      <div class="spinner-layer spinner-red">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					
					      <div class="spinner-layer spinner-yellow">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					
					      <div class="spinner-layer spinner-green">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					    </div>
  
						<H5>please wait...</H5>
						</div>
						
					</div>
			
			</div>
		
		</div>
	</div>

	<!-- searcj jquery cdn on google and copy link from minified version -->
	
	<script
	  src="https://code.jquery.com/jquery-3.6.4.min.js"
	  integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
	  crossorigin="anonymous"></script>

	<script>
		$(document).ready(function(){
			console.log("page is ready...")
		})
	</script>
</body>
</html>