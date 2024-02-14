import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a word: ");

        String input = scanner.nextLine();

        scanner.close();


        Palindrome.check(input);
    }

}
