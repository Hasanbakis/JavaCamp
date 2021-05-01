
public class Student extends User{
	private String registeredCourse;
	private int numberOfDaysWatched;
	private double viewRate;
	
    public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String registeredCourse, int numberOfDaysWatched, double viewRate) {
		super();
		this.registeredCourse = registeredCourse;
		this.numberOfDaysWatched = numberOfDaysWatched;
		this.viewRate = viewRate;
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
