package practice.inheritance.universitymanagementsystem;
import java.util.ArrayList;

public class Professor extends Person implements Payable{
	private int professorId;
	private String department;
	private double baseSalary;
	private ArrayList<Course> coursesTaught;
	
	
	public Professor(String name, int age, String address, int professorId, String department, double baseSalary) {
		super(name, age, address);
		this.professorId = professorId;
		this.department = department;
		this.baseSalary = baseSalary;
		this.coursesTaught = new ArrayList<>();
	}

	public void assignGrade(Course course, Student student, double grade) throws StudentNotInCourseException {
	    if (!student.getEnrolledCourses().contains(course)) {
	        throw new StudentNotInCourseException("Student " + student.getName() + " is not enrolled in " + course.getName());
	    }
	    
	    course.getEnrolledStudents().put(student, grade);
	    System.out.println("Changed grade for " + student.getName() + " to " + grade);
	}
	
	public void conductLecture() {
		System.out.println("Hrr grr I am conducting a lecture! :D");
	}
	
	public void addCourse(Course course) {
		if(coursesTaught.contains(course)) {
			System.out.println("This teacher is already teaching this course!");
			return;
		}
		course.addProfessor(this);
		coursesTaught.add(course);
	}

	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ArrayList<Course> getCoursesTaught() {
		return coursesTaught;
	}

	@Override
	public double calculateSalary() {
	    return baseSalary + coursesTaught.size()*100;
	}

}
