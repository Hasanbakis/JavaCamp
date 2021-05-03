
public class Main {

	public static void main(String[] args) {
		
		//USER
		UserManager userManager = new UserManager();
		
		User user1 = new User();
		user1.setEmail("Engindemirog@gmail.com");
		userManager.add(user1);
		
		
		//STUDENT
		StudentManager studentManager = new StudentManager();
		
	    Student student1 = new Student();
	    student1.setId(1);
	    student1.setEmail("hasan@gmail.com");
	    student1.setFirstName("Hasan");
	    student1.setLastName("Bakis");
	    student1.setNumberOfDaysWatched(3);
	    student1.setRegisteredCourses("Java");
	    
	    Student student2 = new Student();
	    student2.setFirstName("Burak");
	    student2.setLastName("Göktürk");
	    
	    
	    studentManager.listRegisteredCourses(student1);
	    
	    
	    //INSRUCTOR
	    InstructorManager  instructorManager = new InstructorManager();
	    
	    Instructor instructor1 = new Instructor();
	    instructor1.setFirstName("Toprak");
		instructor1.setLastName("Soyden");
		instructor1.setEmail("toprak@gmail.com");
		instructor1.setAboutMe("Im a teacher for 4 years at Selçuk University");
		
		
	    instructor1.setStudentList(new Student[]{student1,student2});
	    

	    
	    instructorManager.ListStudents(instructor1);
	    
	    
	    
	   
		
		
		

	}

}
