import java.util.*;

public class P9_ShoppingCart {
    public static void main(String[] args) {

        // Create a shopping cart using List<Product>
        List<Product> cart = new ArrayList<>(); // Product class used from P6_ProductLookupUsingHashMap.java

        // Add 4 products
        cart.add(new Product(1, "Laptop", 50000));
        cart.add(new Product(2, "Mobile", 20000));
        cart.add(new Product(3, "Headphones", 3000));
        cart.add(new Product(4, "Smartwatch", 7000));

        // Calculate total bill
        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }

        // Print products
        System.out.println("Shopping Cart:");
        for (Product p : cart) {
            System.out.println(p);
        }

        // Print total bill
        System.out.println("Total Bill = " + total);
    }
}

/*
Program 9: Shopping Cart
Create a shopping cart using:
	List<Product>

Add 4 products.

Calculate total bill.

Then explain:
	Why List is suitable here?
 */