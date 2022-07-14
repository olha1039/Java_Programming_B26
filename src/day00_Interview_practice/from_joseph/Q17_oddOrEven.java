package day00_Interview_practice.from_joseph;

public class Q17_oddOrEven {
//    Q17:Numbers -- odd & even
//    Write  a method which can identifies given number is even or odd

//    EX:
//    identify(5) ->  "Odd"
//    identify(6) ->  "Even"

    public static void addOrEven(int a){
        System.out.println(a % 2 != 0 ? "Odd" : "Even");
    }



    public static void main(String[] args) {
        addOrEven(6);
    }


}
