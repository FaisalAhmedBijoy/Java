package javabeginner;

import java.util.Scanner;

public class ArithmeticAssignmentDemo {

    public static void main(String[] args) {
        System.out.println("Arithmetic Operation ");
        int num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.println("Sum : " + result);
        result = num1 * num2;
        System.out.println("Mul : " + result);
        System.out.println("Sub : " + (num1 - num2));

        System.out.println("Assignment Operation ");
        int x, y;
       
        System.out.print("Enter The First Number ");
        x=input.nextInt() ;
        System.out.println("Enter The Second Number ");
        y = input.nextInt();
        x=x+y ;
        System.out.println(" X : " + x);

    }

}
