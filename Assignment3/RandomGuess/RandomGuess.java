import java.util.Scanner;

public class RandomGuess {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  int randomNumber = (int) (Math.random() * 20); 
  int userGuess;
  
  System.out.print("\nCan you guess a lucky number between 0 and 20?");
    do {
    
    System.out.print("\nEnter your guess: ");
    userGuess = input.nextInt();
    
    if (userGuess > randomNumber) {
     System.out.print("\nToo high, try again!🤪");
    }
      else if (userGuess < randomNumber) {
        System.out.print("\nToo low, try again!😝");
      }
        else {
          System.out.println("\nCongratulations, you have guessed the lucky number right!🤩");
        }
  } while (userGuess != randomNumber);
  }
}
