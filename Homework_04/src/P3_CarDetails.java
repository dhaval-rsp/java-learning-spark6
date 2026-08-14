public class P3_CarDetails {
    public static void main(String[] args) {

        // defined how many object needed
        Car[] c = new Car[2];

        // created multiple object using arrays
        c[0] = new Car();
        c[1] = new Car();

        c[0].brand = "Audi";
        c[0].model = "A5";
        c[0].color = "White";
        c[0].price = 3000000;

        c[1].brand = "BMW";
        c[1].model = "B1";
        c[1].color = "BLACK";
        c[1].price = 2500000;

        // Print details
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].brand);
            System.out.println(c[i].model);
            System.out.println(c[i].color);
            System.out.println(c[i].price);
            System.out.println("---------------");
        }
    }
}

class Car{
    String brand;
    String model;
    String color;
    double price;

}

/*
## `Program 3: Car Details`

Create a Car class containing:
	String brand;
	String model;
	String color;
	double price;

Create two objects and print their details
 */