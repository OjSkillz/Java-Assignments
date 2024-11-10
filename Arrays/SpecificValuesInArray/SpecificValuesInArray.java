import java.util.Scanner;
import java.util.Arrays;

public class SpecificValuesInArray {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int[] newArray = {11, 5, 10, 12, 15, 17};
      
   System.out.print("\nEnter a number to test if the array: " + Arrays.toString(newArray) + " contains it: ");
   int specificValue = input.nextInt();
    int outcomeTrue =0;
    int outcomeFalse = 0;
    for (int count = 0; count < newArray.length; count++) {
      if (newArray[count] == specificValue) outcomeTrue ++;
      else outcomeFalse ++;
          }   
          if (outcomeTrue== 1) 
     System.out.println("\nTrue");
       else System.out.println("\nFalse");
  
  }
}
