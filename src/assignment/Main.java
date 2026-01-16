package assignment;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 1001, "Computer Science");
        Professor professor = new Professor("Dr. Smith", 45, 2001, "Engineering");
        Staff staff = new Staff("John", 35, 3001, "Administrator");
        student.displayInfo();
        professor.displayInfo();
        staff.displayInfo();
    }
}