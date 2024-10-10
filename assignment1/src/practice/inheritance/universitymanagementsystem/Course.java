package practice.inheritance.universitymanagementsystem;
import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String name;
    private HashMap<Student, Double> enrolledStudents;
    private ArrayList<Professor> professors;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new HashMap<>();
        this.professors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.putIfAbsent(student, null);
    }

    public void dropStudent(Student student) throws StudentNotInCourseException {
       if (!enrolledStudents.containsKey(student)) {
           throw new StudentNotInCourseException(student.getName() + " is not enrolled in " + name);
       }
       enrolledStudents.remove(student);
       System.out.println(student.getName() + " has been removed from " + name); 
    }

    public void addProfessor(Professor professor) {
        if (!professors.contains(professor)) {
            professors.add(professor);
            System.out.println(professor.getName() + " has been assigned to teach " + name);
        } else {
            System.out.println(professor.getName() + " is already assigned to " + name);
        }
    }

    public HashMap<Student, Double> getEnrolledStudents() {
        return enrolledStudents;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void assignGrade(Student student, double grade) throws StudentNotInCourseException {
      if (!enrolledStudents.containsKey(student)) {
          throw new StudentNotInCourseException("Student " + student.getName() + " is not enrolled in this course.");
      }
      enrolledStudents.put(student, grade);
      System.out.println("Assigned grade " + grade + " to " + student.getName() + " in " + name);
  } 

}
