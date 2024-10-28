import java.util.Scanner;

public class SumOfTwoNumbers {
  public static void main(String[] args) {
    
    String response;
    
    Scanner input = new Scanner(System.in);
    do {
      System.out.print("\nEnter first number: ");
      int firstNumber = input.nextInt(); 
      System.out.print("Enter second number: ");
      int secondNumber = input.nextInt();
      int sum = firstNumber + secondNumber;
      
      System.out.println("The sum of " + firstNumber + " and " + secondNumber +
      " is " + sum);
      
      Scanner feedback = new Scanner(System.in);
      
      System.out.println("\nDo you wish to perform the operation once again?");
      System.out.print("Type Yes or No: ");
      response = feedback.nextLine();    
    }
      while (response.equalsIgnoreCase("Yes"));
    
  }
}
