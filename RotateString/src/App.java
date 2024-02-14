import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Ask the user to enter the count
        System.out.println("Please enter the rotation count: ");
        int count = scanner.nextInt();

        // Rotate the string and display the result
        String rotatedWord = RotateString.rotate(word, count);
        System.out.println("Rotated String: " + rotatedWord);

        scanner.close();
    }
}
