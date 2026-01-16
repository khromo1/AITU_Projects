package assignment;
public class Professor extends Person {
    private int professorId;
    private String department;
    public Professor(String name, int age, int professorId, String department) {
        super(name, age);
        this.professorId = professorId;
        this.department = department;
    }
    public int getProfessorId() {
        return professorId;
    }
    public String getDepartment() {
        return department;
    }
    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void displayInfo() {
        System.out.println("Professor - Name: " + name + ", Age: " + age +
                ", ID: " + professorId + ", Department: " + department);
    }
}