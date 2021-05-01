
public class InstructorManager {
	
	public void ListStudents(Instructor instructor) {
		Student[] students = instructor.getStudentList();
		for(Student student:students) {
			System.out.println(student.getFirstName()+" "+student.getLastName() + " registered ");
		}
	}
	

}
