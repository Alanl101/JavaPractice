import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter a sentence: ");

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        LastLetterCount.aFunction(input);

        scan.close();
    }
}
