import java.util.LinkedHashSet;
import java.util.Set;

public class TraverseString {
    public static void removeDuplicates(String input){
        Set<Character> uniqueSet = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            uniqueSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char uniqueChar : uniqueSet) {
            result.append(uniqueChar);
        }

        System.out.println("Output: " + result.toString());
    }
}
