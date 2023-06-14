<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->

    <title> Spring Security </title>
  </head>
  <body class="container">
    <h1 class="text-uppercase, text-center">Registration Page</h1>

	
	<hr/>
	
	<form:form action="#" method="post">
		
		<div>
			<label>First Name</label>
			<input name="fname"/>
		</div>
		<div>
			<label>Last Name</label>
			<input name="lname"/>
		</div>
		<div>
			<label>Username</label>
			<input name="username"/>
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="password"/>
		</div>
		<div>
			<label>Role</label>
			<input type="checkbox" name="roles" value="STUDENT"/>STUDENT
			<input type="checkbox" name="roles" value="EMPLOYEE"/>EMPLOYEE
			<input type="checkbox" name="roles" value="ADMIN"/>ADMIN
		</div>
		
		<br/>
		<button>Register</button>
		<button type="reset">Reset</button>
	</form:form>
	




    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
  </body>
</html>