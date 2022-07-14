package day21_04_26_2022.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {



        Employee employee=new Employee("Mike",'M',24,150000);
        System.out.println(employee);

        // since it is prviate we need to access with PUBLIC GETTER and SETTER
        //employee.age=25;

        //change name
        employee.setName("");
        System.out.println(employee.getName());


        //change age
        employee.setAge(15);
        System.out.println(employee.getAge());

        //change salary
        employee.setSalary(100000);
        System.out.println(employee.getSalary());


        // increase the salary of employee +20K
        employee.setSalary(employee.getSalary()+20000);
        System.out.println(employee.getSalary());

        // decrease the salary of employee -30K
        employee.setSalary(employee.getSalary()-30000);
        System.out.println(employee.getSalary());



    }
}
