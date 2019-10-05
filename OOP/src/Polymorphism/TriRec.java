package Polymorphism;

public class TriRec {

    public static void main(String[] args) {
        System.out.println("Area Calculation ");
        Shape s = new Shape();
        System.out.println("Shape : " + s.area());

        s = new Triangle(10, 20);
        System.out.println("Triangle " + s.area());

        s = new Reatangle(10, 20);

        System.out.println("Rectangle " + s.area());
    }

}
