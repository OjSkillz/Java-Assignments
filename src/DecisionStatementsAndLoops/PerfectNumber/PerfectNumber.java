import java.util.Scanner;

public class PerfectNumber {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int sum = 0;
    
    System.out.print("\nEnter any whole number to check if it is a perfect number: ");
    int integer = input.nextInt();
    
    for (int numbers = 1; numbers < integer; numbers++) {
      if (integer % numbers == 0) sum += numbers;
    }
    System.out.print( sum == integer ? "\n" + integer + " is a perfect number." : "\n" + integer + " is not a perfect number.");
  
  }
}
