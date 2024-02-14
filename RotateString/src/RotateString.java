public class RotateString{
    public static String rotate(String word, int count){
        
        
        
        if (count == 0 || word.isEmpty()) {
            return word;
        }

        while(word.length() <= count){
            count = count - word.length();
        }

        String rotated = word.substring(word.length() - count) + word.substring(0, word.length() - count);

        return rotated;
    }
}