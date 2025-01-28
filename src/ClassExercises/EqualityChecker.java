import java.util.Scanner;

public class EqualityChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
      System.out.print("\nEnter number 1: ");
      int firstNumber = input.nextInt();
      
      System.out.print("\nEnter number 2: ");
      int secondNumber = input.nextInt();      
      
      System.out.print("\nEnter number 3: ");
      int thirdNumber = input.nextInt();
      
      if (firstNumber == secondNumber && firstNumber == thirdNumber) {
      System.out.println("\nAll "  + "numbers are equal");
      }
      else {
      System.out.println("\nAll " + "numbers are not equal"); 
      }
    }
  }

