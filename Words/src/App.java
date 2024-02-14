import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String input = scanner.nextLine();

        // Display the count of all words in the sentence
        int count = Word.wordCount(input);
        System.out.println("Words in the sentence: " + count);

        scanner.close();
    }
}
