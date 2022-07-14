package day24_05_04_2022.cydeoTask;

public class Student extends Person { // complaining because of constructor, need to call it


    private int ID;
    private String schoolName;

    public Student(String name, char gender, int age, int ID, String schoolName) {
        super(name, gender, age);
        this.ID = ID;
        this.schoolName = schoolName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + "is studying");
    }
    public void attendClass(){
        System.out.println(getName() + "is attending Class");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", ID=" + ID +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
