package practice.inheritance.universitymanagementsystem;

public class ProfessorNotInCourseException extends Exception{
	ProfessorNotInCourseException(String msg) {
		super(msg);
	}
}
