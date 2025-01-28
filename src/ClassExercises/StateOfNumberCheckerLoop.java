import java.util.Scanner;

public class StateOfNumberCheckerLoop {
  public static void main(String[] args) {
  
  
  String response;
 
  Scanner input = new Scanner(System.in);
   
   do { 
    int counter = 1;
      while (counter < 4) {
      System.out.print("\nEnter number " + counter + " : ");
      int userInput = input.nextInt();
      counter++;
    
      if (userInput > 0) {
           System.out.println("\n" + userInput + " is Positive") ;
      } else if (userInput == 0) {
           System.out.println("\n" + userInput + " is a Zero") ;
        } else if (userInput < 0) {
           System.out.println("\n" + userInput + " is Negative") ;
          } 
       }
    Scanner feedback = new Scanner(System.in);
      
    System.out.println("\nDo you wish to perform the operation once again?");
    System.out.print("Type Yes or No: ");
    response = feedback.nextLine();  
    
   } while (response.equalsIgnoreCase("Yes"));
    
  }
}

