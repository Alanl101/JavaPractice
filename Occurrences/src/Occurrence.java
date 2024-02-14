import java.util.HashMap;
import java.util.Map;

public class Occurrence {
    public static Map<Integer, Integer> countOccurrences(int[] array) {
        Map<Integer, Integer> occurrencesMap = new HashMap<>();

        for (int num : array) {
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }

        return occurrencesMap;
    }

    
}