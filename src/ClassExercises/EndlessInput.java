import java.util.Scanner;

public class EndlessInput {
  public static void main(String[] args) {
  
  int counter = 1;
  
  String userResponse;
  
    Scanner input = new Scanner(System.in);
    
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
   
    
  }
}

