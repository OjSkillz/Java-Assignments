import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter a number: ");
    final int MULTIPLICATION_NUMBER = input.nextInt();
    
    System.out.print("\nEnter the number of terms: ");
    int levelOfMultiplication = input.nextInt();
    
    int multiplier = -1;
    
    while (multiplier < levelOfMultiplication) {
      multiplier++;
        System.out.println("\n" + MULTIPLICATION_NUMBER + " x " + multiplier + " = "
      + (MULTIPLICATION_NUMBER * multiplier)); 
    }  
        
  }
}
