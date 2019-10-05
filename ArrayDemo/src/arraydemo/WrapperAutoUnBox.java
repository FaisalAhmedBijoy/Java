/*
Wrpper Class
Autoboxing and Unboxing
Primitive -> Object 
object -> Primitive 

 */
package arraydemo;


public class WrapperAutoUnBox {
    public static void main(String[] args) {
        
        //Primitive -> object
        
        int x=30 ;
        Integer y= Integer.valueOf(x) ;
        System.out.println("y : "+y);
        // Object ->primitive 
        Double d= new Double (10.25) ;
        double e=d.doubleValue() ;
        System.out.println("e : "+e); 
        
        // Conversion Between String and Primivie Data type
        int i =30 ;
        String s =Integer.toString(i ) ;
        System.out.println(s);  //integer to String 
        double dd=100.256 ;
        String s1=Double.toString(dd) ;
        System.out.println(s1);
        // String To Integer 
        
        String str="300" ;
        int ii = Integer.parseInt(str) ;
        System.out.println(ii); 
        
    }
    
}
