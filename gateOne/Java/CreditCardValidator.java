import java.util.Scanner;

public class CreditCardValidator{
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Hello, Kindly Enter Your Card Number To Validate Your Card >>>  ");
    String cardNumber = input.next();  
    
    validateCardType(cardNumber);
    System.out.println(validateCardDetails(cardNumber));
    
    
  }
  public static String validateCardDetails(String string) {
  Character[] validElements = {'0', '1', '2', '3', '4', '6', '7', '8', '9'};
  Scanner input = new Scanner(System.in);
  
  while (string.length() < 13 || string.length() > 16) {
  System.out.println("\nInvalid card length! Card length must be between 13 and 16 digits");
  System.out.print("Enter card number >>>  ");
  string = input.next();  
      
  } return "**Credit Card Number:  " + string + "\n**Credit Card Digit Length:  " + string.length() + "\n" ;
  } 
    
  public static void validateCardType(String cardType) {
   
    if (cardType.charAt(0) == '4') System.out.println("\n**Credit Card Type:   Visa Card");
    else if (cardType.charAt(0) == 5) System.out.println("\n**Credit Card Type:   MasterCard");
    else if (cardType.charAt(0) == 6) System.out.println("\n**Credit Card Type:   Discover Card");
    else if (cardType.charAt(0) == 3 && cardType.charAt(1) == 7) System.out.println("\n**Credit Card Type:   American Express Card");
    else System.out.println("\n**Credit Card Type:   Invalid Card");
    
  }
    
      
  }

