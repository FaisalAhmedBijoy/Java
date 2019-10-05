
package multithreadingdemo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultithreadingDemo {

      public static void main(String[] args) throws InterruptedException  {
          
       
          A obj =new A();
          
         obj.start(); //Thread 1
          
         for (int i = 0; i < 10; i++) {
              System.out.println(1);
           
                //System.out.println(10/0);
                 Thread.sleep (500);    
              
          }
             
          
    }
    
}
class A extends Thread {
    
    public void run(){
      
        
       for (int i = 0; i < 10; i++) {
              System.out.println(2);
              
           try {
               //System.out.println(10/0);
               Thread.sleep (500);
           } catch (InterruptedException ex) {
               Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
           }
                 
              
          }
        
    }
  public void   print () 
  {
      
             
  }
}

