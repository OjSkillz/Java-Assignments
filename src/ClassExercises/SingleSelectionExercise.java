package ClassExercises;

import java.util.Scanner;

public class SingleSelectionExercise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter first number: ");
    int firstNumber = input.nextInt();
    
    System.out.print("\nEnter second number: ");
    int secondNumber = input.nextInt();
    
  
    
    System.out.print((firstNumber > secondNumber) ? "\nGreater" : "");
      
      System.out.print("\nyou are doing well...");
      
  
       int sum = firstNumber + secondNumber;
      
       System.out.print((sum > 50) ? "\neven sum is greater" : "");
        
    
  
  }
}
