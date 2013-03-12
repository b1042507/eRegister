package uk.ac.shu.webarch.eregister

class Instructor {

//setting up variables.
String name
String staffId

Set classes

static hasMany = [classes: RegClass]
static mappedBy = [classes: 'classInstructor']

//set up variable constraints.
static constraints = {

name(nullable:false, blank:false, maxSize:256);
staffId(nullable:false, blank:false, maxSize:20);

}


    
}
