import java.util.Scanner;

public class VowelOrConsonant {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nInput an alphabet: ");
    String userLetter = input.next();
    char character = userLetter.charAt(0);
      
    char min = 'a';
    char max = 'z';
    
    if (userLetter.length() == 1 && character >= min && character <= max) {
       if (userLetter.equalsIgnoreCase("a")) {
        System.out.println("\nInput letter is a " +
        "vowel");
       }
        else if (userLetter.equalsIgnoreCase("e")) {
          System.out.println("\nInput letter is a " +
        "vowel");
        }
          else if (userLetter.equalsIgnoreCase("i")) {
            System.out.println("\nInput letter is a " +
            "vowel");
          }
            else if (userLetter.equalsIgnoreCase("o")) {
              System.out.println("\nInput letter is a " +
              "vowel");
            }
              else if (userLetter.equalsIgnoreCase("u")) {
                System.out.println("\nInput letter is a " +
                "vowel");
              }
                else {
                  System.out.println("\nInput Letter is a consonant");        
                }
    }
      else {
        System.out.println("Invalid input! Enter a \"single\" character from within the"
        + " range" + " of the English alphabet (a or A - z or Z");
      }  
  }
}
