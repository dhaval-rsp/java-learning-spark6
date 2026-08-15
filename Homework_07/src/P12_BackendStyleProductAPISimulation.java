public class P12_BackendStyleProductAPISimulation {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        try {
            service.getProductById(101);
            service.getProductById(203);
            service.getProductById(-5);
            service.getProductById(202);
        }

        catch (InvalidProductIdException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }

        catch (ProductNotFoundException e) {
            System.out.println("Lookup Failed: " + e.getMessage());
        }

        finally {
            System.out.println("Program completed");
        }

    }
}

class InvalidProductIdException extends Exception {
    public InvalidProductIdException(String message) {
        super(message);
    }
}

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class ProductService {

    public void getProductById (int productId)
            throws InvalidProductIdException, ProductNotFoundException {

        if (productId <= 0) {
            throw new InvalidProductIdException("Error: Product ID must be greater than 0.");
        }
        else if (productId != 101) {
            throw new ProductNotFoundException("Error: Product with ID " + productId + " not found.");
        }
        else {
            System.out.println("Product found: ID = "+productId+", Name = Laptop, Price = 50000");
        }
    }
}

/*
## `Program 12: Backend-Style Product API Simulation`

Create:
	ProductNotFoundException
	InvalidProductIdException
	ProductService
	Main

In ProductService , create method:
	void getProductById(int productId)

Rules:
	If productId is less than or equal to 0, throw InvalidProductIdException .
	If productId is not 101, throw ProductNotFoundException .
	If productId is 101, print product details.

In main method:
	Call service method inside try.
	Use multiple catch blocks.
	Print user-friendly messages.
 */