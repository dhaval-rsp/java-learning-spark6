public class P7_InheritancePractice {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", 180, "Petrol");
        c1.showCarDetails();

    }
}


class Vehicle{
    private  String brand;
    private int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    String showVehicleDetails() {
        return "This is " + brand + " brand car and top speed is: " + speed;
    }

}

class Car extends Vehicle{
    private String fuelType;

    Car(String brand, int speed, String fuelType){
        super(brand, speed); //super calling parent class const
        this.fuelType = fuelType;
    }

    void showCarDetails(){
        System.out.println(showVehicleDetails() + " and fuel type is: " + fuelType);
    }
}
