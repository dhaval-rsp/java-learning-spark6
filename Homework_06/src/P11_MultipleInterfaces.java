public class P11_MultipleInterfaces {
    public static void main(String[] args) {
        PrinterMachine machine = new PrinterMachine();

        // Call both methods
        machine.print();
        machine.scan();
    }
}

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// 1 Class 2 interfaces
class PrinterMachine implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}


/*
## `Program 11: Multiple Interfaces`

Create two interfaces:
	Printable
		- print()
	Scannable
		- scan()

Create class PrinterMachine that implements both interfaces.
Call both methods from main method.
 */