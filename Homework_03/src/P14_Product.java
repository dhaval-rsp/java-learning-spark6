class ProductDetails{
	String name;
	double price;
	int quantity;
}

class P14_Product {
    public static void main(String[] args) {
		ProductDetails myProd = new ProductDetails();
		
		myProd.name = "Avatar Whey Protein";
		myProd.price = 3500;
		myProd.quantity = 20;
		
		System.out.println("The total price of " + "'"+ myProd.name +"'" + " for quantity " + myProd.quantity + " is " + (myProd.price*myProd.quantity));
		
    }
}