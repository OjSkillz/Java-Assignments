import java.util.Scanner;

public class StringToIntegerConverter {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("\nInput a number as a string: ");
  String userInput = input.nextLine();
  
  System.out.println("\nThe integer value is: " + Integer.parseInt(userInput));
  }
}
