package javabeginner;

import java.util.Scanner;

public class LoopSeries {

    public static void main(String[] args) {

        System.out.println("Print Series by for Loop ");
        int n,fact=1;
        System.out.println("Enter The Last Number of The Series ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            fact*=i ; ;
        }
        System.out.println("Factorial of  : "+n +" = "+fact);

    }

}
