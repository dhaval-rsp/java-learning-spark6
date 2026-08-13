class ProductInventory{
    String name;
    int stock;

    void currentStock(){
        System.out.println("The current stock of " + name + " is "+ stock + " quantity");
    }

    void addStock(int qty){
        stock += qty;
        System.out.println("Added " + qty + " quantity. " + "Stock updated to:- " + stock);
    }

    void sell(int qty){
        if ( qty <= stock){
            stock -= qty;
        }
        else{
            System.out.println( "You cannot sell " + qty + " as it is greater than available stock is " + stock );
        }
    }
}

public class C3_Inventory {
    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory();

        p1.name = "HD Monitor";
        p1.stock = 255;

        p1.currentStock();
        p1.addStock(25);
        p1.currentStock();
        p1.sell(281);
        p1.currentStock();
        //System.out.println("We have " + p1.stock + " "+ p1.name+ " Right Now");


    }
}
