public class Word {
    public static int wordCount(String sentence){
        String[] words = sentence.split("\\s+");
        return words.length;
    }

}
