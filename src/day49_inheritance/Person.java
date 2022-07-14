package day49_inheritance;

import day17_04_12_2022.Student;

public class Person {
    /*
    Person is the Super class
    name, age, favorite hobby
                    talk()
    Student
    class it the sub class of Person
            stressLevel
            study()
            */

    String name;
    int age;
    String favoriteHobby;

    public void talk(){
        System.out.println(name + " is talking");
    }
}
