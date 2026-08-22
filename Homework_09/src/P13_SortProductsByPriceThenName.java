import java.util.*;

public class P13_SortProductsByPriceThenName {
    public static void main(String[] args) {

        // Create list of products -
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", 50000));
        products.add(new Product(102, "Mobile", 20000));
        products.add(new Product(103, "Tablet", 20000));
        products.add(new Product(104, "Headphones", 3000));
        products.add(new Product(105, "Smartwatch", 7000));

        // Sort by price ascending, then by name alphabetically
        Collections.sort(products, Comparator
                .comparingDouble((Product p) -> p.price)
                .thenComparing(p -> p.name));

        // Print sorted products
        System.out.println("Products sorted by price, then name:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

// Product class defined under P6_ProductLookupUsingHashMap

/*
Program 13: Sort Products By Price Then Name
Create Product class with:
	id
	name
	price

Sort products:
	1. By price ascending
	2. If price is same, by name alphabetically

Use Comparator
 */