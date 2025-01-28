import java.util.Scanner;

public class ValuesInRange {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter lower bound of range, x: ");
    int lowerBound = input.nextInt();
    
    System.out.print("\nEnter upper bound of range, y: ");
    int upperBound = input.nextInt();
    
    System.out.print("\nEnter a divisor, p: ");
    int divisor = input.nextInt();
    
    int counter = 0;
    int number = lowerBound;
    while (lowerBound <= number  && number <= upperBound) {
      if (number % divisor == 0) {
          number += 1;
          counter += 1;  
          System.out.println("\n" + counter);
      }  
    }  
    
  }
}
