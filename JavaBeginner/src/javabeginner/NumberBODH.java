/*
 *Decimal To Binary ,Octal ,Hexa,
 */
package javabeginner;


 
public class NumberBODH {
    public static void main(String[] args) {
        int decimal =15 ;
        String octal=Integer.toOctalString(decimal) ;
        System.out.println("Octal : "+octal);
        
        String hexa =Integer.toHexString(decimal) ;
        System.out.println("Hexa "+hexa); 
        
        //Binary To Decimal
        String binary ="1010" ;
        int dec = Integer.parseInt(binary,2) ;
        System.out.println(dec);
                
    }
}
