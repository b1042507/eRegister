<!DOCTYPE html>
<html>
	<head>
		<style>

			h1 { margin-left: 20px }
			p { margin-left: 20px }

		</style>

		<meta name="layout" content="main"/>
		<title>eRegister</title>
		
	</head>
	<body>
		<br/>
		<h1>Welcome to my eRegister application.</h1>
		<br/>
		<br/>
			<p>
			<g:link controller = "course" action = "list" >List Courses</g:link><br/>
			<g:link controller = "student" action = "list" >List Students</g:link><br/>
			<g:link controller = "instructor" action = "list" >List Instructors</g:link><br/>
			<g:link controller = "regClass" action = "list" >List Registered Classes</g:link><br />
			<g:link controller = "apply" action = "index" >Attendance Utility</g:link>
			</p>

	</body>

</html>
