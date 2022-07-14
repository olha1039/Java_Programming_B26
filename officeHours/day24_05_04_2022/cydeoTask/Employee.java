package day24_05_04_2022.cydeoTask;

public class Employee extends Person {

    private String title;
    private int employeeID;
    private double salary;

    public Employee(String name, char gender, int age, String title, int employeeID, double salary) {
        super(name, gender, age);
        this.title = title;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void word(){
        System.out.println(getName() + " is working");
    }
    public void attendMeetings(){
        System.out.println(getName() + " is attending Meetings");
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", title='" + title + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
