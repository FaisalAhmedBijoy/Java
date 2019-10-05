package basicjava;

import java.util.Scanner;

public class Finonacci {

    public static void main(String[] args) {
        System.out.println("Enter the Number ");
        Scanner input = new Scanner(System.in);
        int first = 0, second = 1, fibo, sum = 0, num;
        num = input.nextInt();
        System.out.print(" " + first);
        System.out.print(" " + second);
        for (int i = 3; i <= num; i++) {
            fibo = first + second;
            System.out.print(" " +fibo);
            first= second ;
            second= fibo ;
            
        }
        System.out.println(" ");

    }

}
