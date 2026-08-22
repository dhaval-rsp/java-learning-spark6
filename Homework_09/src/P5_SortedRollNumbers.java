import java.util.*;
public class P5_SortedRollNumbers {
    public static void main(String[] args) {

        // create a treeset for roll no
        Set<Integer> rollno = new TreeSet<>();

        // adding rollno randomly
        rollno.add(105);
        rollno.add(103);
        rollno.add(101);
        rollno.add(108);
        rollno.add(102);
        rollno.add(125);

        // printing in sorted order
        System.out.println("Sorted Roll Numbers:");
        for(int roll : rollno){
            System.out.println(roll);
        }
    }
}

/*
Program 5: Sorted Roll Numbers
Create a TreeSet<Integer> for roll numbers.

Add roll numbers in random order.

Print sorted roll numbers.
 */