import java.util.Scanner;

public class Palindromes {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    int userInput;
   
    System.out.print("\nEnter a five-digit number:  ");
    userInput = input.nextInt();
    int lengthOfUserInput = String.valueOf(userInput).length();
    
    while (lengthOfUserInput != 5) {
    System.out.print("\nOut of range! Enter a" + 
    " five-digit number:  ");
    userInput = input.nextInt(); 
    lengthOfUserInput = String.valueOf(userInput).length();
    }
    int firstTwoDigits = userInput / 1000;
    int lastTwoDigits = userInput % 100;
    int firstDigit = firstTwoDigits / 10;
    int secondDigit = firstTwoDigits % 10;
    int lastDigit = lastTwoDigits % 10;
    int secondToLastDigit = lastTwoDigits / 10;
    
    System.out.println(firstDigit == lastDigit && secondDigit == secondToLastDigit ?
    userInput + " is a palindrome" : userInput + " is not a palindrome"); 
    }
  }
