package uk.ac.shu.webarch.eregister

class RegClass {

//setting up variables.
String name
String classCode
Instructor classInstructor
Course course

Set enrolledStudents
//Set regSheets



    static hasMany = [enrolledStudents:Enrollment]
    
    static mappedBy = [enrolledStudents:'regclass']
	
//set up variable constraints.
    static constraints = {
classCode(nullable:true);
    }

    static mapping = {

	classInstructor column: 'instructor_fk'
	course column: 'course_fk'
	classCode column: 'mapped_class_code'
}
}
