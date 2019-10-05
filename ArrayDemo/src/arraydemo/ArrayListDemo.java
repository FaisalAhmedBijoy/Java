/*
 ArrayList is Like Vector in C++ STL

 */
package arraydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
    private static Object collections;

    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(11);
        number1.add(2);
        number1.add(333);
        number1.add(44);
        System.out.println("Number1 : "+number1); 
        
         number2.add(110);
        number2.add(20);
        number2.add(300);
        number2.add(40);
        System.out.println("Number2 : "+number2); 
        System.out.println("Number3 : "+number3);
        
        number3.addAll(number1) ;
        System.out.println("Number3 : "+number3);
        boolean result =number1.equals(number3) ;
        System.out.println("Result : "+result);
        Collections.sort(number3); 
        System.out.println("Sorted Num3 : "+number3);
        Collections.sort(number2,Collections.reverseOrder()) ;
        System.out.println("Des Sort Num2 : "+number2); 
        
        
        
        

    }

}
