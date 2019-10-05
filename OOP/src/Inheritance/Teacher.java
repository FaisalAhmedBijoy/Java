
package Inheritance;


public class Teacher extends Person {
    String Qualification ;

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }
    
    void Display()
    {
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Qualification : "+getQualification());
    }
    
}
