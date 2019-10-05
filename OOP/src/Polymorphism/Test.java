package Polymorphism;

public class Test {

    public static void main(String[] args) {
        System.out.println("Polymorphism");
        Person p = new Person(); // Super Class
        p.Display();
        p = new Teacher();  // P point to Sub class Teacher method
        p.Display();
        p = new Student(); // P point to SUb class Student Method

        p.Display();

    }
}
