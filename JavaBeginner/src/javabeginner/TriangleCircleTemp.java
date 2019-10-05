/*
 1. Area of Triangle 
 2. Area of Circle
 3.Temparature Conversion 
 */
package javabeginner;

import java.util.Scanner;

public class TriangleCircleTemp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;

        double base, height;
        
        char ch ;
       // ch=input.next().charAt(0) ;
        System.out.println("Area of Triangle \n\nEnter The base ");

        base = input.nextDouble();
        System.out.println("Enter The height ");
        height = input.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Traingle  Area : " + area);

        System.out.println("Area of The Circle \n\nEnter The radious ");
        double radious;
        radious = input.nextDouble();
        area = 3.14 * radious * radious;
        System.out.println("Area of Circle : " + area);

        System.out.println("Temparature change Celcious & Farenheight \n1.Farenheight to Celcious\n2.Celcious to Fartenheight");
        double c, f;
        int k;
        k = input.nextInt();
        if (k == 1) {
            System.out.print("Enter F : ");
            f = input.nextDouble();

            c = 5.0 / 9.0 * (f - 32);
            System.out.println("Celcious : " + c);

        } else if (k == 2) {
            System.out.print("Enter C : ");
            c = input.nextDouble();

            f = 9.0 / 5.0 + 32;
            System.out.println("Celcious : " + f);
        } else {
            System.out.println("Wrong Option ");
        }

    }

}
