class Product{
    String name;
    double price;
    int quantity;
}

public class P5_ProductDetails {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.name = "Avatar Protein";
        p1.price = 3500;
        p1.quantity = 23;

        System.out.println("Your product is " + p1.name + " with quantity: " + p1.quantity +  " & total amount is: " + (p1.price*p1.quantity));
    }
}

