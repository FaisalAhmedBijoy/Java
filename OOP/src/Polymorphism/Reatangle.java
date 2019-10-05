
package Polymorphism;


public class Reatangle extends Shape {
    double length ;
    double width ;
    Reatangle (double length ,double width){
        this.length=length ;
        this.width=width ;
    }
    @Override
    double area(){
        return length* width ;
    }
    
}
