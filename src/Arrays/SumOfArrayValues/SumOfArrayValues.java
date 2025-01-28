import java.util.Scanner;
import java.util.Arrays;

public class SumOfArrayValues {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
  int total = 0;
  int[] myArray = new int[5];
  
  System.out.println("Enter " + myArray.length + " integer values: \n");
  for (int index = 0; index < myArray.length; index++) {
 myArray[index] = input.nextInt();
  
  total = total + myArray[index];
  }
  System.out.println("\nThe sum of all the elements of " + Arrays.toString(myArray) + " is " + total);
  }
}
