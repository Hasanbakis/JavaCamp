
public class Instructor extends User{
	private Student[] studentList;
	private String[] attendanceList;
	private String aboutMe;
	

	public Instructor() {
		// TODO Auto-generated constructor stub
	   }


	public Instructor(Student[] studentList, String[] attendanceList) {
		super();
		this.studentList = studentList;
		this.attendanceList = attendanceList;
	}




	public Student[] getStudentList() {
		return studentList;
	}


	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}


	public String[] getAttendanceList() {
		return attendanceList;
	}




	public void setAttendanceList(String[] attendanceList) {
		this.attendanceList = attendanceList;
	}
	
	public String getAboutMe() {
		return aboutMe;
	}


	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}



  
}
