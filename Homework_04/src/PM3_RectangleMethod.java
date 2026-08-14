public class PM3_RectangleMethod {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.length = 24;
        rec.width = 34;

        double resArea = rec.calculateArea();
        double resPeri = rec.calculatePerimeter();

        System.out.println(resArea);
        System.out.println(resPeri);
    }
}

class Rectangle{
    double length;
    double width;

    double calculateArea(){
        return length*width;
    }

    double calculatePerimeter(){
        return (length+width)*2;
    }
}

/*
## `Program 3: Rectangle`

Create a Rectangle class containing:
	double length;
	double width;

Add methods:
	double calculateArea()
	double calculatePerimeter()
 */