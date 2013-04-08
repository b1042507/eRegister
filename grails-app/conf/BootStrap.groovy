import uk.ac.shu.webarch.eregister.*;

class BootStrap {

	def init = { servletContext ->
	
	   println("BootStrap::init");
		
	//creating test data (expand as to why)

	   def ab_instructor = Instructor.findByStaffId('634564f') ?: new Instructor(staffID:'634564f', name: 'Andrew Brown').save();

	   def web_arch_course = Course.findByCourseCode('45121845f') ?: new Course(courseCode: '45121845f', courseName: 'Web Architectures', description: 'Headache for students').save();

	   def new_class = RegClass.findByClassCode('7345537f') ?: new RegClass(classCode: '7345537f', name:'WebArch-Mondays', classInstructor:ab_instructor, course:web_arch_course).save();
	

	}

	def destroy = {
	}

}

