// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

// 4. Create Consonants class in JAVA and then do the following:
// - Ask User to enter a sentence or create a String variable to assign a sentence to it
// - Count all consonants in a String and display the count
// - Replace all consonants with '*' in a String


public class App {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a sentence: ");

    String input = scan.nextLine().toLowerCase();
    
    Consonant.numberOfConsonants(input);

    scan.close();
  }

}