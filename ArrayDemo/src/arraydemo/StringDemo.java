/*

 */
package arraydemo;

public class StringDemo {

    public static void main(String[] args) {
       
        System.out.println("String Addition");
        String FirstName = "Anisul islam";
        String LastName = "anisul Islam";
        String FullName = FirstName + LastName;
        System.out.println(FullName);

        FullName = FirstName.concat(LastName);
        System.out.println(FullName);

        String UpperName = FullName.toUpperCase();
        System.out.println(UpperName);

        String LowerName = FullName.toLowerCase();
        System.out.println(LowerName);

        boolean b = FirstName.startsWith("Ani");
        System.out.println("b : " + b);
        boolean last = LastName.endsWith("p");
        System.out.println("Last : " + last);
        if (FirstName.equalsIgnoreCase(LastName)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    
        
        String country ="Bangladesh is my country" ;
        System.out.println(country);
        String s3=country.trim() ; // Remove Space Head & Tail 
        System.out.println(s3);
        
        char ch=country.charAt(0) ;
        System.out.println("ch = "+ch);
        int value =country.codePointAt(0) ; // Show The ASCII Value
        System.out.println("value : "+value);
        
        int pos=country.indexOf("is") ;
        System.out.println("Pos : is = "+pos);
        
        pos=country.lastIndexOf("n") ;
        System.out.println("n : "+pos); 
        
        // Repalce & Split of a String 
        
        String s1="This is my Country " ;
        System.out.println(s1) ;
        
        String s2=s1.replace("i", "j") ;
        System.out.println(s2);
        
        String [] s4=s1.split(" ") ;
        for (String x :s4) {
            System.out.println(x);
        }
     }

}
