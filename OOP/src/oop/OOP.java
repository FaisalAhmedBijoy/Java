package oop;

public class OOP {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Faisal", "Male ","01623155000", 48);
        /*
         t1.name ="Fasial Ahmed Bijoy" ;
         t1.gender="Male" ;
         t1.id=48 ;
         t1.phone="01623155000" ;
         */
       // t1.SetInformation("Fasal", "Male ","01623155000", 48);
        t1.Display();

        Teacher t2 = new Teacher("Abir", "Male", "01687650858", 32);
        /*
         t2.name ="Abir Hasan Joy" ;
         t2.gender="Male " ;
         t2.phone="01687650858" ;
         t2.id =32 ;
         */
        // t2.SetInformation("Abir", "Male", "01687650858",32 );
        t2.Display();
        Teacher t3 =new Teacher () ; // Default Constructor
        t3.Display(); 
        Teacher t4=new Teacher("Abir", "Male", "01687650858") ;
        t4.Display(); 
         
        System.out.println("Square : " +t1.square(t1.id));
    }

}
