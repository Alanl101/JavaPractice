public class Vowel{

    public static void count(String input){

        int counter = 0;
        String vowels = "aeiou";

        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++){
            if (vowels.contains(String.valueOf(input.charAt(i)))) {
                counter++;
            }
        }
        
        System.out.println("Vowel count: " + counter);
    }
}