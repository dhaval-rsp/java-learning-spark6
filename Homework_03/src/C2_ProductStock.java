class Product{
	String name;
	double price;
	int stock;

}

class C2_ProductStock {
    public static void main(String[] args) {
        Product myProd1 = new Product();
        Product myProd2 = new Product();
        Product myProd3 = new Product();
        Product myProd4 = new Product();
		
		myProd1.name = "Avatar Whey Protein";
		myProd1.price = 3500;
		myProd1.stock = 20;

		myProd2.name = "MB Creatine";
		myProd2.price = 500;
		myProd2.stock = 0;

		myProd3.name = "Black coffee";
		myProd3.price = 789;
		myProd3.stock = 0;

		myProd4.name = "Amul Paneer";
		myProd4.price = 100;
		myProd4.stock = 202;

		if (myProd1.stock > 0) {
            System.out.println(myProd1.name + " is in stock (" + myProd1.stock + ")");
        }

		if (myProd2.stock > 0) {
            System.out.println(myProd2.name + " is in stock (" + myProd2.stock + ")");
        }

		if (myProd3.stock > 0) {
            System.out.println(myProd3.name + " is in stock (" + myProd3.stock + ")");
        }

		if (myProd4.stock > 0) {
            System.out.println(myProd4.name + " is in stock (" + myProd4.stock + ")");
        }
				
    }
}