import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");

        String input = scan.nextLine();

        TraverseString.removeDuplicates(input.toLowerCase());

    }
}