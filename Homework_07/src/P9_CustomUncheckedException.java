public class P9_CustomUncheckedException {
    public static void main(String[] args) {

        ProductServiceNew service = new ProductServiceNew();

        try {
            service.findProduct(101);
            service.findProduct(202);
        }

        catch (ProductNotFoundExceptionNew e) {
            System.out.println(e.getMessage()); // Handle custom exception
        }

        finally {
            System.out.println("Program completed");
        }
    }
}

class ProductNotFoundExceptionNew extends RuntimeException {

    public ProductNotFoundExceptionNew(String message) {
        super(message);
    }
}

class ProductServiceNew {
    public void findProduct(int productId) {
        if (productId != 101) {
            // Throw custom unchecked exception
            throw new ProductNotFoundExceptionNew("Error: Product with ID "
                    + productId +
                    " not found.");
        }
        else {
            System.out.println("Product found");
        }
    }
}

/*
## `Program 9: Custom Unchecked Exception`

Create custom exception:
	ProductNotFoundException extends RuntimeException

Create class ProductService with method:
	void findProduct(int productId)

Rules:
	If product id is not 101 , throw ProductNotFoundException .
	Otherwise print "Product found" .
	Handle exception in main method.
 */