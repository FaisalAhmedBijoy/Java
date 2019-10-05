
package oop;

import java.util.Scanner;


public class ExceptionHandleing {
    public static void main(String[] args) {
        while (true){
            try{
                int num1,num2,result ;
            Scanner input= new Scanner (System.in);
            System.out.print("First Number :");
            num1=input.nextInt() ;
            System.out.print("Second Number : ") ;
            num2=input.nextInt() ;
            result=num1/num2 ;
                System.out.println("Result : "+result);
            }
            catch (Exception e){
                System.out.println("Exception : "+e);
                System.out.println("Try again");
            }
            
            
        }
    }
    
}
