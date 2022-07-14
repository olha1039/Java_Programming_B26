package day24_05_04_2022.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Student student = new Student("Mike", 'M', 25, 10233, "Cydeo");

        System.out.println(student);

        Tester tester = new Tester("John", 'M', 25, "Tester", 12345, 100_000);

        //OVERRIDEN methods
        tester.attendMeetings();
        tester.word();
        tester.drink("coffee");

        //comes from parents
        tester.eat("chips");
        tester.sleep();

    }
}
