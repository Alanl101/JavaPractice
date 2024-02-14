import java.util.HashMap;

public class LastLetterCount{
    public static void aFunction(String input){
        int count = 0;
        int Scount = 0;
        int Ycount = 0;

        HashMap<String, Integer> pairs = new HashMap<>();

        for(int i = 0; i < input.length(); i++){
            if(i == input.length() - 1 && (input.charAt(i) == 's' ||  input.charAt(i) == 'y')){
                count++;
                if(input.charAt(i) == 's'){
                    if(Scount == 0){
                        pairs.put()
                    }

                    Scount++;
                }
            }else if(input.charAt(i + 1) == ' ' && (input.charAt(i) == 's' ||  input.charAt(i) == 'y')){
                count++;
            }


        }



    }
}