package practice.inheritance.universitymanagementsystem;

public class University {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "123 Street", 1001, "Computer Science");
        Professor professor = new Professor("Dr. Smith", 45, "456 Avenue", 2001, "Math", 25000);
        Staff staff = new Staff("Mary", 35, "789 Boulevard", 3001, "Admin");
        
        Course math = new Course("Algebra I");
        student.enrollCourse(math);
        professor.addCourse(math);
        
        processPerson(student);
        processPerson(professor);
        processPerson(staff);
    }

    public static void processPerson(Person person) {
        if (person instanceof Payable) {
            double salary = ((Payable) person).calculateSalary();
            System.out.println("Salary for " + person.getName() + ": " + salary);
        } else if (person instanceof Student) {
            System.out.println("Student " + person.getName() + " is majoring in " + ((Student) person).getMajor());
        }
    }
}
