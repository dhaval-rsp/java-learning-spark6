class Car {
	String brand;
	String color;
	double price;
}

class P13_Car {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();
		
		myCar.brand = "BMW";
		myCar.color = "White";
		myCar.price = 2500000.0;
		
		yourCar.brand = "Ferari";
		yourCar.color = "Black";
		yourCar.price = 4500000.0;
		
		System.out.println("My Car is: " + myCar.brand);
		System.out.println("Color of car is: " + myCar.color);
		System.out.println("Price of Car is: " + myCar.price);
		
		System.out.println();
		
		System.out.println("Your Car is: " + yourCar.brand);
		System.out.println("Color of car is: " + yourCar.color);
		System.out.println("Price of Car is: " + yourCar.price);
    }
}