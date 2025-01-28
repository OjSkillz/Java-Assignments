package ClassExercises;

import java.util.Scanner;

public class Lottery {
  public static void main(String... args) {
    int randomNumber = 56;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nGuess a lucky number between 0 and 100: ");
    int userGuess = input.nextInt();
    
    if (userGuess > randomNumber || userGuess < randomNumber) {
      System.out.println("\nIncorrect, try again later!🫣\n");
    }
    else {
      System.out.println("\nCongratulations, you have guessed right!💯\n");     
    }
  
  }
}
