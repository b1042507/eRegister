package uk.ac.shu.webarch.eregister

class RegistrationSheet {

//setting up variables.
Course course
Date sheetDate
Set signatories
String notes

//set up variable constraints.
    static constraints = {
	course(nullable:false, blank:false);
	sheetDate(nullable:false, blank:false);
	notes(nullable:true, blank:true);
    }

static mapping = {
notes column: 'course_desc', type:'text'
}
	
}
