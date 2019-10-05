
package javabeginner;

import java.util.Scanner;


public class Input {
    public static void main (String[] args){
       // System.out.println("How to get User Input ");
        
        Scanner input =new Scanner (System.in) ;
        
        String name ;
        System.out.print("Enter The Name : ");
        
        name=input.nextLine() ;
        
        
        
        
        int number ;
        System.out.print("Enter Roll Number : ");
        number =input.nextInt() ;
        
      
        String Department ;
        System.out.print("Enter Department Name : ");
        Department =input.next() ;
        
        
        System.out.println("Name : "+name );
        System.out.println("Roll  : "+number );
        System.out.println("Department : "+Department );
        
        
        
        
    }
            
            
           
    
}
 