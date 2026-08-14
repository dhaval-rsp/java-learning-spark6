import java.text.DecimalFormat;

public class PM5_ProductServiceMethod {
    public static void main(String[] args) {

        ProductDetails p1 = new ProductDetails();
        p1.name = "Apple Iphone";
        p1.price = 110000;
        p1.quantity = 235;

        double resTotalAmount = p1.calculateTotal();
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("Your product is " + p1.name +
                " with quantity: " + p1.quantity);

        System.out.println("Price of each unit is " + p1.price + " and total amount is " + df.format(resTotalAmount));
    }
}

class ProductDetails{

    String name;
    double price;
    int quantity;

    double calculateTotal(){
        return price*quantity;
    }
}

/*
## `Program 5: Product Service`

Add a method:
	double calculateTotal()

It should return:
	price * quantity
 */