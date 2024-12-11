import java.util.Scanner;
import java.util.Arrays;


public class CreditCardValidator{
public static void main(String...args) {
    creditCardValidator();
  }
  
  public static String validateCardDetails(String cardNumber) {
  Scanner input = new Scanner(System.in);
  
  while (cardNumber.length() < 13 || cardNumber.length() > 16) {
  System.out.println("\nInvalid card length! Card length must be between 13 and 16 digits");
  System.out.print("Enter card number >>>  ");
  cardNumber = input.next();  
  } return "**Credit Card Number:  " + cardNumber + "\n**Credit Card Digit Length:  " + cardNumber.length()  ;
  } 
    
  public static String validateCardType(String cardNumber) {
  if (cardNumber.charAt(0) == '4') return "\n**Credit Card Type:   Visa Card";
  else if (cardNumber.charAt(0) == 5) return "\n**Credit Card Type:   MasterCard";
  else if (cardNumber.charAt(0) == 6) return "\n**Credit Card Type:   Discover Card";
  else if (cardNumber.charAt(0) == 3 && cardNumber.charAt(1) == 7) return "\n**Credit Card Type:   American" +
  " Express Card";
  else return "\n**Credit Card Type:   Invalid Card"; 
  }
    
  public static int doubleSecondDigitsFromRight(String cardNumber) {
  int[] doubledDigits = new int[cardNumber.length() / 2];
  int total = 0;
  for(int index = cardNumber.length() - 2, index1 = 0; index >= 0; index-= 2, index1++) {
  doubledDigits[index1] = Integer.parseInt(String.valueOf(cardNumber.charAt(index))) * 2 ;
  }
    for(int index = 0; index < doubledDigits.length; index++){
    if(doubledDigits[index] - 1 >= 9){
    int sum = 0;
    
    while (doubledDigits[index] > 0){
    int singleDigit = doubledDigits[index] % 10;
    sum += singleDigit;
    doubledDigits[index] = doubledDigits[index] / 10;
    }
    doubledDigits[index] = sum;
    }
    total += doubledDigits[index];
    }
    return total;
    }

    public static int sumOddPlacedDigits(String cardNumber){
    int sumOfOddPlacedDigits = 0;
    for(int index = cardNumber.length() -1; index > 0; index-= 2){
    sumOfOddPlacedDigits += Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
    }
    return sumOfOddPlacedDigits;
    }
    
    public static int sumOddPlacedAndDoubledDigits(String cardNumber) {
    return sumOddPlacedDigits(cardNumber) + doubleSecondDigitsFromRight(cardNumber);
    }  
    
    public static String validateCardStatus(String cardNumber) {
    if (sumOddPlacedAndDoubledDigits(cardNumber) % 10 == 0) return "**Credit Card Validity Status:  Valid";
    else return "**Credit Card Validity Status:  Invalid";
    }
    
    public static void creditCardValidator() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Hello, Kindly Enter Your Card Number To Validate Your Card >>>  ");
    String cardNumber = input.next();  
    
    System.out.println(validateCardType(cardNumber));
    System.out.println(validateCardDetails(cardNumber));
    System.out.println(validateCardStatus(cardNumber));
    

    }
}

