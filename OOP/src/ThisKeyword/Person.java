
package ThisKeyword;


public class Person {
    String name ;
    int age  ;
    void sms ()
    {
        System.out.println("This is a sms ");
    }
    Person (String name ,int age)
            
    {
       this.sms() ;
        this.name=name ;
        this.age=age ;
        
    }
    void Display()
    {
        System.out.println("Name : "+name );
        System.out.println("Age : "+age );
    }
    
}
