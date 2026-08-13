import static java.lang.Math.*;

public class P8_AbstractClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 9.0);

        circle.showMessage();
        System.out.println("Circle area = " + circle.calculateArea());

        rectangle.showMessage();
        System.out.println("Rectangle area = " + rectangle.calculateArea());
    }
}

abstract class Shape {

    // we will complete method in implementation
    abstract double calculateArea();

    // normal method
    public void showMessage() {
        System.out.println("This is a abstract shape class.");
    }
}

// Child Circle
class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    // implementing abstract method
    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}

// Child Rectangle
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // implementing abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}



