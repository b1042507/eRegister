===================
<h2>eRegister</h2>
===================
<h5>An Electronic Registration System</h5>
========================================


This eRegister github repositary is created originally for an Assignment piece 
under my Web Architectures module at Sheffield Hallam University.

The focus of this assignment  was to demonstrate an understanding in creating an 
application using the MVC framework. The functionality of the application is that of
an eRegister system allowing the user to record/edit/add information in relation to
class attendance. 

The eRegister still has some work in progress in terms of tracking and listing attendance
stats for students, although everything else is fully functional.

This guide to building and using the project follows a few assumptions that you have:

<b>. A working debian installation</b><br />
<b>. A working knowledge of git</b><br />
<b>. A working grails installation</b><br />

Below I will discuss how you can clone, build and run this application in order to
see for yourself.

=================
<h4>Clone the project</h4>
=================

First thing you'll want to do when cloning the eRegister repository is changing the terminal
directory using the "cd" command. once this is done we can move onto the cloning process, the command
to do this are seen as below:


<b> " $git clone https://github.com/b1042507/eRegister.git "</b>

once this has been run, to make sure the project has been cloned and is on your system use the "cd" change directory 
command once again to where you stored the eRegister:

<b>e.g " $cd /eRegister "</b>

You can now run the list command to see if all files are there:

<b> " $ls "</b>


==================================
<h4>Build and Run the project</h4>
==================================

After cloning the project you can build and run it in a few easy steps:

Firstly make sure you are in the right directory "eRegister", if not run the same code as before
<b>" $cd /eRegister "</b> to change directory into eRegister. 

You can now run the command <b>" $grails run-app ".</b> 

What this will do is compile the application and give you a link which you can open and use the functionality of
the eRegister. Read the "Using the eRegister Application" section below for more information.

p.s. If you run into an error like such <b>" Grails: java.io.FileNotFoundException: Could not open ServletContext resource [/WEB-INF/applicationContext.xml] "</b>
simply use the command <b>" grails upgrade "</b> and repeat the <b>" grails run-app "</b> process.


===================
<h4>Using the eRegister</h4>
===================

Once you open the link given to you by running the app, you should come accross an index page with the selected options:

<b>.List Courses</b><br />
<b>.List Students</b><br />
<b>.List Instructors</b><br />
<b>.List Registered Classes</b><br />

Within each of these the relevant tables will be shown to you along with the "CRUD" functionality allowing you to Create, Read, Update
and Delete records.
