import java.util.*;

public class P7_WordFrequencyCounter {
    public static void main(String[] args) {

        // Given input string
        String input = "java spring java sql spring java";

        // Split into words
        String[] words = input.split(" ");

        // Create HashMap to store words frequencies
        Map<String, Integer> freqMap = new HashMap<>();

        // Count frequency - looping through words array
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Print frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

/*
Program 7: Word Frequency Counter
Given:
	java spring java sql spring java

Use HashMap<String, Integer> to count frequency.

Expected output idea:
	java = 3
	spring = 2
	sql = 1
 */