package ClassExercises;

import java.util.Scanner;

public class MaximumNumbers { 
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int counter = 0;
      int maximum = 0;

      int number = 0;
      while (counter < 3) {
          counter++;
          System.out.print("Enter number " + counter + ": ");
          number = input.nextInt();

          if (number > maximum) {
              number = maximum;
          }
      }
      System.out.print("\nThe maximum number is " + number);
  }
}
