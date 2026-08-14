public class P12_PaymentSystem {
    public static void main(String[] args) {
        // Create UPI payment object
        PaymentGateway upiPayment = new UpiPayment("TXN1001", "ashwani@upi");
        PaymentGateway cardPayment = new CardPayment("TXN1002", "1234-5678-9876-5432");

        upiPayment.pay(500.0);
        System.out.println("------------");
        cardPayment.pay(1200.0);
    }
}

interface PaymentGateway {
    void pay(double amount);
}

abstract class BasePayment {

    static String appName = "CodeForSuccess";
    String transactionId;

    public BasePayment(String transactionId) {
        this.transactionId = transactionId;
    }

    public void printReceipt(double amount) {
        System.out.println("App: " + appName);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Successful!");
    }
}

// UPI Payment class
class UpiPayment extends BasePayment implements PaymentGateway {

    String upiId;

    public UpiPayment(String transactionId, String upiId) {
        super(transactionId);
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment via " + upiId);
        printReceipt(amount);
    }
}

// card payment
class CardPayment extends BasePayment implements PaymentGateway {

    String cardNumber;

    public CardPayment(String transactionId, String cardNumber) {
        super(transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Card Payment via Card Number: " + cardNumber);
        printReceipt(amount);
    }
}

/*
## `Program 12: Payment System`

Create:

interface PaymentGateway
	- pay(double amount)

abstract class BasePayment
	- static appName
	- transactionId
	- constructor
	- printReceipt()

class UpiPayment extends BasePayment implements PaymentGateway
	- upiId
	- constructor
	- pay(double amount)

class CardPayment extends BasePayment implements PaymentGateway
	- cardNumber
	- constructor
	- pay(double amount)

In main method:
	1. Create one UPI payment object.
	2. Create one card payment object.
	3. Use PaymentGateway reference.
	4. Call pay() method.
 */
