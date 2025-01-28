package GroupCodeChallenge;

import java.util.Scanner;

public class LcmOfTwoNumbers {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    int multiple = 2;
    
    System.out.print("Enter first number >> ");
    int firstNumber = input.nextInt();
    
    System.out.print("Enter second number >> ");
    int secondNumber = input.nextInt();
    
    while (multiple <= 100 && multiple != firstNumber && multiple != secondNumber) {
      if (firstNumber % multiple == 0 && secondNumber % multiple == 0) {
        System.out.println("\nThe lowest common multiple of both numbers is " + multiple);
        break;
      }
    multiple++;
    }
    
  }
}
