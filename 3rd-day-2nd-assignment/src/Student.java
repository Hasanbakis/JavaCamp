
public class Student extends User{
	int id;
	int UsedId;
	String firstName;
	String lastName;
	private String registeredCourse;
	private int numberOfDaysWatched;
	private double viewRate;
	
	
	
    public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int id, int usedId, String firstName, String lastName, String registeredCourse,
			int numberOfDaysWatched, double viewRate) {
		super();
		this.id = id;
		UsedId = usedId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.registeredCourse = registeredCourse;
		this.numberOfDaysWatched = numberOfDaysWatched;
		this.viewRate = viewRate;
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



	public String getRegisteredCourse() {
		return registeredCourse;
	}


	public void setRegisteredCourses(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}


	public int getNumberOfDaysWatched() {
		return numberOfDaysWatched;
	}


	public void setNumberOfDaysWatched(int numberOfDaysWatched) {
		this.numberOfDaysWatched = numberOfDaysWatched;
	}


	public double getViewRate() {
		return this.numberOfDaysWatched * 10;
	}
	
	
	
	
	
	
	
	
	

}
