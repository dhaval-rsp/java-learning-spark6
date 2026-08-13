public class P4_ProductBill {
    public static void main(String[] args) {
        Product p[] = new Product[3]; //array of 3 student

        p[0] = new Product("Oats", 220, 25); // creating student object with variables
        p[1] = new Product("Amul Milk", 70, 456 );
        p[2] = new Product("Book1", 250, 22);

        p[0].showBill();
        p[1].showBill();
        p[2].showBill();
    }
}

class Product{
    private String name;
    private double price;
    private int quantity;

    // parameterized constructor
    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // calculating total bill
    double calculateTotal(){
        return price * quantity;
    }

    void showBill(){
        System.out.println("For your product " + "\"" +name + "\"" + " the total Bill amount is: " + calculateTotal());
        // since the calculateTotal was returned type method i can call in other method
    }

}

