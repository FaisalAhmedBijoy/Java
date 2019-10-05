
package basicjava;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println("Sum of Digit ");
        int num,temp,sum=0 ,r ;
        
        Scanner input=new Scanner (System.in) ;
        System.out.println("Enter a Number ");
        num =input.nextInt();
        
        temp =num ;
        while (temp!=0)
        {
            r=temp%10 ;
            System.out.println(" "+r);
            sum =sum*10 +r ;
            temp =temp/10 ;
        }
        System.out.println("Sum of Digit : "+sum);
        if (sum == num){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    
    }
    
}
