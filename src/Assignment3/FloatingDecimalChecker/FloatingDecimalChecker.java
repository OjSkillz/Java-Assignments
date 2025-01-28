import java.util.Scanner;

public class FloatingDecimalChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nEnter two floating-point numbers up to " +
    "three decimal places");
    
    System.out.print("\nFirst number: ");
    double firstNumber = input.nextDouble();
    
    System.out.print("\nSecond number: ");
    double secondNumber = input.nextDouble();
    
    int firstNumberQuotient = (int)firstNumber;
    int secondNumberQuotient = (int)secondNumber;
    
    double firstNumberRemainder = firstNumber - firstNumberQuotient;
    double secondNumberRemainder = secondNumber - secondNumberQuotient;
    
    if (firstNumberQuotient == secondNumberQuotient && firstNumberRemainder ==
    secondNumberRemainder) {
      System.out.println("\nBoth numbers are same");
    }
    else {
      System.out.println("\nBoth numbers are different");
    }
  }
}
