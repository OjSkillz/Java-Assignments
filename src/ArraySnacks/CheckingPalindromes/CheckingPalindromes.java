import java.util.Scanner;

public class CheckingPalindromes {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter any word to test if it is a palindrome >> ");
    String word = input.nextLine();
    checkPalindrome(word);
  
  }
  
  public static void checkPalindrome(String string) {
    
    String reversedString = "";
    
    for (int reverseIndex = string.length() -1; reverseIndex >= 0; reverseIndex-- ) {
      reversedString+= string.charAt(reverseIndex);
      }
      System.out.println(string.equalsIgnoreCase(reversedString) ? "\n" + string + " is a palindrome." : "\n" + string + " is not a palindrome." );
    
    }
  }
