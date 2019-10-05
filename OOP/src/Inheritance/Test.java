
package Inheritance;


public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher() ;
      /*
        t1.Qualification="Bsc CSE" ;
        t1.name="Fasial Ahmed" ;
        t1.age =20 ;
        System.out.println("Name : "+t1.name);
        System.out.println("Age : "+t1.age);
        System.out.println("Qualification : "+t1.Qualification);
    
     */
        t1.setName("Faisal Ahmed") ;
        t1.setAge(18) ;
        t1.setQualification("BSc in CSE");   //Qualification ("CSE") ;
        t1.Display();
        
        Teacher t2=new Teacher () ;
        t2.setName("Abir Hasan");
        t2.setAge(23) ;
        t2.setQualification("MSc in BGE");
        t2.Display();
        
        
        
     }
    
}
