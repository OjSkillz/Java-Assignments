package ClassExercises;

import java.util.Scanner;

public class LotteryLoop {
  public static void main(String... args) {
   
    
    Scanner input = new Scanner(System.in);
    int randomNumber = (int)(Math.random() * 100);;
    int userGuess;   
    do {
    System.out.print("\nGuess a lucky number between 0 and 100: ");
    
    userGuess = input.nextInt();
    
      if (userGuess > randomNumber) {
      System.out.println("\nToo high, try again!🫣\n");
      } 
        else if (userGuess < randomNumber) {
        System.out.println("\nToo low, try again!🫣\n");
        }

    } while (userGuess != randomNumber);
    
    System.out.println("\nCongratulations, you have guessed right!💯\n");
    }
}
