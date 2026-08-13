import java.text.DecimalFormat;
class ProductNew{

    String name;
    double price;
    int quantity;

    double calculateTotal(){
        return price*quantity;
    }
}

public class PM5_ProductServiceMethod {
    public static void main(String[] args) {

        ProductNew p1 = new ProductNew();
        p1.name = "Apple Iphone";
        p1.price = 110000;
        p1.quantity = 235;

        double resTotalAmount = p1.calculateTotal();
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("Your product is " + p1.name + " with quantity: " + p1.quantity);
        System.out.println(df.format(resTotalAmount));
    }
}
