import java.util.*;

public class P8_CharacterFrequencyCounter {
    public static void main(String[] args) {

        // Given input string
        String input = "banana";

        // Create HashMap to store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print frequencies
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

/*
Program 8: Character Frequency Counter
Given:
	banana

Use HashMap<Character, Integer> to count each character.
 */