
public class StudentManager {
	
	public void listRegisteredCourses(Student student) {
		
		if(student.getViewRate() <=100) {
			System.out.println( "Registered to " +student.getRegisteredCourse() + " and %"+student.getViewRate()+" finished");
		}else {
			System.out.println( "Registered to " +student.getRegisteredCourse() + " and completely finished");
		}
			
		
	}
	
	
	
	
	
	
	
	

}
