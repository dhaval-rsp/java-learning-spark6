class Car{
    String brand;
    String model;
    String color;
    double price;

}

public class P3_CarDetails {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.model = "A1";
        c1.color = "BLACK";
        c1.price = 2500000;

        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);

    }
}
