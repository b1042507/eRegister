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
			
		<p>This section allows you to Add/Edit/Delete Records in relation to courses, students, instructors and classes.</p><br />

			<p>
			<g:link controller = "course" action = "list" >List Courses</g:link><br/>
			<g:link controller = "student" action = "list" >List Students</g:link><br/>
			<g:link controller = "instructor" action = "list" >List Instructors</g:link><br/>
			<g:link controller = "regClass" action = "list" >List Registered Classes</g:link><br/>
			<br/>


<p>This section is currently not functional although is currently being developed.</p><br />
			<p>
			<p> Add/Edit Attendance</p><br/>
			<p> List Attendance</p>
			</p>

	</body>

</html>
