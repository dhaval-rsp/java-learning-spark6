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
