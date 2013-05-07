import uk.ac.shu.webarch.eregister.*;

class BootStrap {

	def init = { servletContext ->
	
	   println("BootStrap::init");
		
	//creating test data to show and allow testing of functionality and use of the eRegister without needing to add data.

		def arnold_instructor = Instructor.findByStaffId('634564F') ?: 
			new Instructor(staffId:'634564F', name: 'Arnold Brutz').save(failOnError:true);	   
		def ralph_instructor = Instructor.findByStaffId('456754L') ?: 
			new Instructor(staffId:'456754L', name: 'Ralph Wiggins').save();



	        def web_arch_course = Course.findByCourseCode('17171717F') ?: 
			new Course(courseCode: '17171717F', 
			courseName: 'Web Architectures', 
			description: 'Headache for students').save();
 	

	        def monday_am_class = RegClass.findByNameAndCourse('WebArch-Mondays', web_arch_course) ?: 
			new RegClass(name:'WebArch-Mondays', 
			classInstructor:ralph_instructor, 
			course:web_arch_course, 
			classCode: 'WA1').save(failOnError:true);
			

 		def thursday_pm_class = RegClass.findByNameAndCourse('WebArch-Thursdays', web_arch_course) ?: 
			new RegClass(name:'WebArch-Thursdays', 
			classInstructor:arnold_instructor, 
			course:web_arch_course, 
			classCode: 'WA2').save(failOnError:true);
	
		def student_1 = Student.findByStudentNumber('AZ111') ?:
			new Student(studentNumber:'AZ111', fullStudentName:'Alfie Zane').save(failOnError:true);
		def student_2 = Student.findByStudentNumber('HJ111') ?:
			new Student(studentNumber:'HJ111', fullStudentName:'Harry James').save();
		def student_3 = Student.findByStudentNumber('OK111') ?:
			new Student(studentNumber:'OK111', fullStudentName:'Oscar Killy').save();
		def student_4 = Student.findByStudentNumber('PE111') ?:
			new Student(studentNumber:'PE111', fullStudentName:'Peter Entfer').save();



		def student_1_web_arch = Enrollment.findOrCreateByStudentAndRegclass(student_1,monday_am_class)
		def student_2_web_arch = Enrollment.findOrCreateByStudentAndRegclass(student_2,thursday_pm_class)
		def student_3_web_arch = Enrollment.findOrCreateByStudentAndRegclass(student_3,monday_am_class)
		def student_4_web_arch = Enrollment.findOrCreateByStudentAndRegclass(student_4,thursday_pm_class)


//def regSheet_1 = RegistrationSheet.findByRegSheetNumber('REG1') ?: new RegistrationSheet(regClass:monday_am_class,sheetDate:new Date(),notes:'note',regSheetNumber:'REG1').save(failOnError:true);

//def regSheet_2 = RegistrationSheet.findByRegSheetNumber('REG2') ?: new RegistrationSheet(regClass:thursday_pm_class,sheetDate:new Date(),notes:'note',regSheetNumber:'REG2').save(failOnError:true);


	}

	def destroy = {
	}

}

