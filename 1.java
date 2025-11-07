
import java.util.*;

public class CharacterArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the characters:");
        String input = sc.nextLine().toLowerCase(); // Convert to lowercase for uniformity

        char[] chars = input.toCharArray();
        HashMap<Character, Integer> freq = new HashMap<>();
        int vowels = 0, consonants = 0;

        // Count frequency and identify vowels/consonants
        for (char c : chars) {
            if (Character.isLetter(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);

                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        // Find duplicates
      
  List<Character> duplicates = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1)
                duplicates.add(entry.getKey());
        }

        // Display results
        System.out.print("Duplicate Characters are: ");
        for (int i = 0; i < duplicates.size(); i++) {
            System.out.print(duplicates.get(i));
            if (i < duplicates.size() - 1)
                System.out.print(", ");
        }

        System.out.println("\nNumber of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        sc.close();
    }
