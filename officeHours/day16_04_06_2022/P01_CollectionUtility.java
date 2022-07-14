package day16_04_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P01_CollectionUtility {
    public static void main(String[] args) {


    /*
     COLLECTION --> It is an interface
        COLLECTIONS --> It is Utility class, that contains swap(), reverse(), sort(), etc
        Collections is a class, public class, you can see it when typed in a blue cycle


        Collections Methods*/

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,-5,0,-1,30,7,8,20,20,20));
        System.out.println("Original: " + numbers);


        //sort()    : sort the given collection
        System.out.println("-----SORT-----");
        Collections.sort(numbers);
        System.out.println(numbers);

	//reverse() : reverse the order of the elements in given collection
        System.out.println("-----reverse-----");
        Collections.reverse(numbers);
        System.out.println(numbers);

	//max()     : returns the biggest element
        System.out.println("--------MAX----------");
        System.out.println(Collections.max(numbers));

	//min()     : returns the smallest element
        System.out.println("--------MAX----------");
        System.out.println(Collections.min(numbers));

        //   Find second max number from arraylist
        System.out.println("-----second max number------");
        numbers.removeIf(each->Collections.max(numbers)==each); //it will remove first max value from the arraylist, removes 30
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);//20
        System.out.println("--------third max number---------");
        numbers.removeIf(each->Collections.max(numbers)==each); //it will remove second max value from the arraylist, removed all 20
        int thirdMax = Collections.max(numbers);
        System.out.println(thirdMax);//10

	//swap()    : swap the elements in the collection with their indexes
        System.out.println("------swap--------");
        System.out.println(numbers);
        Collections.swap(numbers, 0, numbers.size()-1);
        System.out.println(numbers);

        //frequency(c,o):
        System.out.println("-------FREQ---------");
		//	       c – the collection in which to determine the frequency of o
        //           o – the object whose frequency is to be determined

        System.out.println(Collections.frequency(numbers, 10));

    }
}