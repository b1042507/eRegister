package uk.ac.shu.webarch.eregister

class Course {

//setting up variables.
String courseName
String courseCode
String description
int myIntProp=1

//the classes contained in the course.
Set classes

//set up variable constraints.
    static constraints = {
courseCode maxSize: 20
    }


static hasMany = [classes: RegClass]
static mappedBy = [classes: 'course']

static mapping = {

table 'course'
courseName column: 'course_name'
courseCode column: 'mapped_course_code'
description column: 'course_desc', type: 'text'




}

}
