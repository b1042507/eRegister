/*package uk.ac.shu.webarch.eregister

import grails.converters.*

  class ApplyController {

    def index() {
     }

    def processAttendance() {

     println(params)
     println("STUDENT ID: ${params.StudentId}");
     println("REGISTER ID: ${params.RegistrationId}");

  	def student_1 = Student.findByStudentNumber(params.StudentId) ?: println("An error has occured finding student.")
 
	def regSheet_1 = RegistrationSheet.findByRegSheetNumber(params.RegistrationId)

     	def new_reg_entry = new RegisterEntry(student:student_1,regSheetNumber:regSheet_1).save()

     println("STUDENT LOOKUP: ${student_1}, SHEET: ${regSheet_1}");
 
     redirect(action:'index', params:params)

  }
 
  

  def listActiveClasses(){

    def result= [:]

    result.allClasses=[]

    RegClass.list().each{ cls ->

       println("class:${cls}")

       boolean inc_class = false
 
       def signedSheets = 0

       cls.regSheets.each { sheet ->

       if(sheet.signatories?.size() > 0)

          signedSheets++

       }




       if (signedSheets > 0){
 
       result.allClasses.add(cls)

       }

   }

 

   return result

  

  }

  def listActiveSummary(){

     

           def regClass_a = RegClass.findByName(params.NameId) ?:
 
           def new_regClass_id = new classId(name:class_a,classInstructor:AB, course:WebArchs).save()




  def result= [:]

    result.allClasses=[]

    RegClass.list().each{ cls ->
 
       println("class:${cls}")

       boolean inc_class = false

       def signedSheets = 0

       cls.regSheets.each { sheet ->

       if(sheet.signatories?.size() > 0)
 
          0++

       }




       if (signedSheets > 0){

       result.allClasses.add(cls)

       }   

  }







}*/
