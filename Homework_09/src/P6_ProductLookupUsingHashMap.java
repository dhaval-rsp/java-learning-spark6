import java.util.*;

public class P6_ProductLookupUsingHashMap {
    public static void main(String[] args) {

        // Create a HashMap to store products by ID
        Map<Integer, Product> products = new HashMap<>();

        // Store 5 products
        products.put(101, new Product(101, "Laptop", 50000));
        products.put(102, new Product(102, "Mobile", 20000));
        products.put(103, new Product(103, "Tablet", 15000));
        products.put(104, new Product(104, "Headphones", 3000));
        products.put(105, new Product(105, "Smartwatch", 7000));

        // Search product by id
        int searchId = 103;
        Product p = products.get(searchId);

        if (p != null) {
            System.out.println("Found: " + p);
        } else {
            System.out.println("Product not found");
        }
    }
}

// Product class
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product[ID=" + id + ", Name=" + name + ", Price=" + price + "]";
    }
}

/*
Program 6: Product Lookup Using HashMap
Create Product class with:
	id
	name
	price

Create:
	Map<Integer, Product> products = new HashMap<>();

Store 5 products.

Search product by id.
 */