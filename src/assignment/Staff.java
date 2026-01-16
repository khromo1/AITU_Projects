package assignment;
public class Staff extends Person {
    private int staffId;
    private String role;
    public Staff(String name, int age, int staffId, String role) {
        super(name, age);
        this.staffId = staffId;
        this.role = role;
    }
    public int getStaffId() {
        return staffId;
    }
    public String getRole() {
        return role;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public void displayInfo() {
        System.out.println("Staff - Name: " + name + ", Age: " + age +
                ", ID: " + staffId + ", Role: " + role);
    }
}
