package practice.inheritance.universitymanagementsystem;
import java.util.ArrayList;

public class Student extends Person{
	private int studentId;
	private String major;
	private ArrayList<Course> enrolledCourses;
	
	public Student(String name, int age, String address, int studentId, String major) {
		super(name, age, address);
		this.studentId = studentId;
		this.major = major;
		this.enrolledCourses = new ArrayList<>();
	}

	public void enrollCourse(Course course) {
		enrolledCourses.add(course);
		course.enrollStudent(this);
		System.out.println(name + " enrolled in " + course.getName() + ".");
	}
	
	public void dropCourse(Course course) {
        enrolledCourses.removeIf(c -> c.equals(course));
		System.out.println(name + " dropped out of " + course.getName() + ".");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public ArrayList<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
	
}
