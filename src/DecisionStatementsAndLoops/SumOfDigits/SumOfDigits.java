import java.util.Scanner;

public class SumOfDigits {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int sum = 0;
    int integer;
    
    do {
    System.out.print("\nEnter a positive whole integer with any number of digits: ");
    integer = input.nextInt();
    } while (integer <= 0);
    
    int integer1 = integer;
    while (integer1 > 0) {
      int digits = integer1 % 10;
      integer1 = integer1 / 10;
      sum += digits;
    }
    
    System.out.println("The sum of all the digits of " + integer + " is " + sum);
      
  }
}
