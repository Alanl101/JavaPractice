// c = Character.toLowerCase(c); 
//"bcdfghjklmnpqrstvwxyz".indexOf(c) >= 0;

public class Consonant{
    static int counter = 0;
    static String modifiedInput = "";
    
    public static void numberOfConsonants(String input){
      for(int i = 0; i < input.length(); i++ ){
        if("bcdfghjklmnpqrstvwxyz".indexOf(input.charAt(i)) >= 0){
            counter++;
            modifiedInput += '*';
        }else{
          modifiedInput += input.charAt(i);
        }
      }
  
      System.out.println("Number of consonants " + counter);
      System.out.println("Modified sentence: " + modifiedInput);
      
    }
  }