import java.util.Scanner;

public class StateOfNumbers {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter a floating-point number >> ");
    double integer = input.nextDouble();
    
    if (integer == 0) System.out.println("\nZero");
    else if (integer < 0 && Math.abs(integer) >= 1 && Math.abs(integer) <= 1000000)  System.out.println("\nNegative");
    else if ( integer > 0 && Math.abs(integer) >= 1 && Math.abs(integer) <= 1000000 ) System.out.println("\nPositive");
    else if ( integer < 0 && Math.abs(integer) < 1)  System.out.println("\nNegative small");
    else if ( integer < 0 && Math.abs(integer) > 1000000)  System.out.println("\nNegative large ");
   else if (integer > 0 && Math.abs(integer) < 1) System.out.println("\nPositive small");
   else if (integer > 0 && Math.abs(integer) > 1000000) System.out.println("\nPositive large");

    }
  }
