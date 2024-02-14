import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {10, 10, 5, 12, 3, 5};

        Map<Integer, Integer> occurrences = countOccurrences(array);

        System.out.println("Array Input: " + java.util.Arrays.toString(array));
        System.out.println("Output: " + occurrences);
    }
}
