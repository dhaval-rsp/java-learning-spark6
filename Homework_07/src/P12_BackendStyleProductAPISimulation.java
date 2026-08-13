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
    public void getProductById(int productId) throws InvalidProductIdException, ProductNotFoundException {
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


