package uk.ac.shu.webarch.eregister

class RegisterEntry {

//setting up variables.
Student student
Long timestamp

//set up variable constraints.
    static constraints = {
timestamp(nullable:false, blank:false);
    }


static mapping = {
table 'student_register_entry'
student column: 'student_fk'
}
}
