package uk.ac.shu.webarch.eregister

class Student {

//setting up variables.
   String fullStudentName
   String studentNumber
   String notes

//the course/'s student is enrolled on.
   Set course

//the classes student has attended.
   Set classAtts

    static hasMany = [
	courses: Enrollment,
	classAtts: RegisterEntry
]

    static mappedBy = [
	courses:'student',
	classAtts:'student'
]

//set up variable constraints.
    static constraints = {
	fullStudentName(nullable:false, blank:false,maxSize:256);
	studentNumber(nullable:false, blank:false,maxsize:256);
}
    
}
