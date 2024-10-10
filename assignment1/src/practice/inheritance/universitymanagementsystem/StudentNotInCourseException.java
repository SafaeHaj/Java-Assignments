package practice.inheritance.universitymanagementsystem;

public class StudentNotInCourseException extends Exception{
	public StudentNotInCourseException(String msg) {
		super(msg);
	}
}
