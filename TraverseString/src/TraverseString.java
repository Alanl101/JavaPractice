import java.util.LinkedHashSet;
import java.util.Set;

public class TraverseString {
    public static void removeDuplicates(String input){
        Set<Character> uniqueSet = new LinkedHashSet<>();

        // Traverse the string and add unique characters to the set
        for (char c : input.toCharArray()) {
            uniqueSet.add(c);
        }

        // Create a string from the set of unique characters
        StringBuilder result = new StringBuilder();
        for (char uniqueChar : uniqueSet) {
            result.append(uniqueChar);
        }

        System.out.println("Output: " + result.toString());
    }
}
