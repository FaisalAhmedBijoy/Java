/*
 open the template in the editor.
 */
package arraydemo;


public class StringBufferBuilder {
    public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer ("Anisul Islam ") ;
        System.out.println(sb);
        sb.append("Rahman") ;
        System.out.println(sb);
        
        sb.delete(0,5) ;
       // System.out.println(sb);
        sb.setLength(5) ;
       // System.out.println(sb) ;
        
        //String Palindrome : 
        
        String s1="12321" ;
        StringBuffer sbp=new StringBuffer(s1) ;
        String s2=sbp.reverse().toString() ;
        if (s1.equals(s2))
            System.out.println("Palindrome") ;
        else
            System.out.println("Not Palindrome"); 
        
        // String Builder
        
        StringBuilder str= new StringBuilder ("Faisal") ;
        System.out.println(str);
        str.append("Ahmed ") ;
        str.append(48) ;
        System.out.println(str);
        str.reverse() ;
        System.out.println(str); 
        str.delete(2, 5) ;
        System.out.println(str);
        str.reverse() ;
        System.out.println(str) ;
        
        
        
        
    }
    
}
