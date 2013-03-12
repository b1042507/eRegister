package uk.ac.shu.webarch.eregister

class Enrollment {

//setting up variables.
Student student
RegClass regclass

//set up variable constraints.
    static constraints = {
    }

static mapping = {
table 'course_student'
student column: 'student_fk'
course column: 'course_fk'
}

}
