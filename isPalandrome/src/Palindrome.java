public class Palindrome {
    public static void check(String input){

        input = input.toLowerCase();
        String reversed = reverse(input);

        // System.out.println(reversed);

        if(reversed.equals(input)){
            System.out.println(input + " is a palindrome");
        }else{
            System.out.println(input + " isn't a palindrome");
        }

    }

    private static String reverse(String input){
        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }
}
