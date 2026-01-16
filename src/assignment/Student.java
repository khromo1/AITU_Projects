package assignment;
public class Student extends Person {
    private int studentId;
    private String major;
    public Student(String name, int age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getMajor() {
        return major;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void displayInfo() {
        System.out.println("Student - Name: " + name + ", Age: " + age +
                ", ID: " + studentId + ", Major: " + major);
    }
}