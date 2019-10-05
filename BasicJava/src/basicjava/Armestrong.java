
package basicjava;

import java.util.Scanner;


public class Armestrong {
    
    public static void main(String[] args) {
        System.out.println("Enter A number ");
        int temp ,num ,sum=0 ,r ;
        Scanner input =new Scanner (System.in) ;
        num =input.nextInt() ;
        temp =num ;
        while (temp!=0){
            r =temp %10 ;
            sum =sum +r *r*r ;
            temp =temp/10 ;
        }
        if (sum == num){
            System.out.println("Armestrong  number : "+num);
        }
        else
            System.out.println("Not Armestrong Number : "+num);
    }
    
}
