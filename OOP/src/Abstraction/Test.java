
package Abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser ms ;
        ms=new Rahim() ;
        ms.SendMessege();
        
        ms=new Karim();
        ms.SendMessege();
        
        ms.call();
    }
    
}
