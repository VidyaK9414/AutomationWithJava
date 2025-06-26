
//Abstract Shape Implementation
//Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle" and "Circle" and
// implement "getArea()" for each.
package Test_OOPs;

import javax.xml.transform.Source;

public class Challenge8 {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 3);
        r.getArea();
        Shape c = new Circle(4);
        c.getArea();

    }

    }

abstract class Shape{

    abstract void getArea();

}

class Rectangle extends Shape{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    void getArea() {
        double area = length * width;
        System.out.println("Rectangle Area: "+ area);
    }
}

class Circle extends Shape{
    int circleArea;
    Circle(int circleAreac){
        this.circleArea =circleAreac;

    }
    @Override
    void getArea() {
        float π = 3.14f;
        double r = π *  this.circleArea * this.circleArea;
        System.out.println("Circle Area: "+ r);

    }
}