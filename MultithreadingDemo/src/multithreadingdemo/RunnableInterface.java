
package multithreadingdemo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class RunnableInterface {
    public static void main(String[] args) {
        
        myThread t1=new myThread() ;
        Thread t2=new Thread(t1);
        t2.start();
    }
          
            
    
}
class myThread extends A implements Runnable
{
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(myThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}

