
public class Instructor extends User{
	int id;
	int UsedId;
	String firstName;
	String lastName;
	private Student[] studentList;
	private String[] attendanceList;
	private String aboutMe;
	

	public Instructor() {
		// TODO Auto-generated constructor stub
	   }


	public Instructor(int id, int usedId, String firstName, String lastName, Student[] studentList,
			String[] attendanceList, String aboutMe) {
		super();
		this.id = id;
		UsedId = usedId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentList = studentList;
		this.attendanceList = attendanceList;
		this.aboutMe = aboutMe;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUsedId() {
		return UsedId;
	}


	public void setUsedId(int usedId) {
		UsedId = usedId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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
