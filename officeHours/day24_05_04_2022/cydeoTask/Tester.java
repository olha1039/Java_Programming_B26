package day24_05_04_2022.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, char gender, int age, String title, int employeeID, double salary) {
        super(name, gender, age, title, employeeID, salary);
    }

    public void word(){
        System.out.println(getName() + " is working");
    }
    public void attendMeetings(){
        System.out.println(getName() + " is attending Meetings");
    }

}
