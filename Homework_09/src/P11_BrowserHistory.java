import java.util.*;

public class P11_BrowserHistory {
    public static void main(String[] args) {

        // Create ArrayDeque to act as a stack
        ArrayDeque<String> history = new ArrayDeque<>();

        // Push pages (like visiting pages)
        history.push("Home");
        history.push("Courses");
        history.push("Java");
        history.push("Collections");

        // Current page is the top of the stack
        System.out.println("Current Page: " + history.peek());

        // Go back (pop removes the top page)
        history.pop();

        // After going back, new current page
        System.out.println("After going back, Current Page: " + history.peek());
    }
}

/*
Program 11: Browser History
Use ArrayDeque<String> as stack.
Push:
	Home
	Courses
	Java
	Collections

Use pop() to go back.

Print current page after going back.
 */