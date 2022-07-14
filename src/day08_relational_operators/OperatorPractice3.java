package day08_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h = 5;
        int p = h; // p gets assigned the value of h, which is 5

        h++; //post increment, no other code so it adds 1

        System.out.println(h); //6
        System.out.println(p); //5

        int k = h++; //post increment, get the value first, which is 6 and assign it to the new variable k, so k has the value of 6. Then h adds one

        System.out.println(h); //7
        System.out.println(k); //6

        int g = ++h; ///pre increment, witch means it increments 1 right away, then it assigns the value from h to the new variable g

        System.out.println(h); //8
        System.out.println(g); //8




    }
}
