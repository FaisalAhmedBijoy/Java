package datatype;

public class DataType {

    public static void main(String[] args) {

        System.out.println("Data Type Representation ");
        int a;

        a = 10;
        double d ;
        d=20.55151651651619649651612632163125 ;
        boolean b= true ;
             
        // Java Method for print of println
        System.out.println("a value : "+a);
        System.out.println("d Value : "+d);
        System.out.println("b Value : "+b );
     
        
        // Format Specifier for printf ,As like C
        
        System.out.println("Format Specifier ");
        System.out.printf("A : %d \n",a) ;
        System.out.printf("D : %.3f \n",d) ;
        System.out.printf("B : %b \n",b); 
      
    }

}
