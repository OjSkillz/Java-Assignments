import java.util.Scanner;

public class NumberIdentifier {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nLet's check if there's any number within your peferred range that's divisible by both 7 and 13...");
    
    System.out.print("\nLower limit of your range:   ");
    int lowerLimit = input.nextInt();
    
    System.out.print("\nUpper limit of your range:   ");
    int upperLimit = input.nextInt();
    
    int count = 0;
    for (int number = lowerLimit; number <= upperLimit ;  number++) {
   
     if (number % 7 == 0 && number % 13 == 0) {
        System.out.println("\nThe first number divisible by both 7 and 13 within the range specified is " + number);
        count++;
     break;
    }   
    } if (count < 1) System.out.println("\nThere is no such number within the specified range"); 
  
  }
}
