import java.util.Scanner;
import java.util.Arrays;

public class MinimumElementOfAnArray {
  public static void main(String... args) {
      Scanner input = new Scanner(System.in);
 
      int[] newArray = new int[5];
      int index = 0;


      System.out.println("Enter " + newArray.length + " elements of an array: ");
       int minimumValue = newArray[0];
      while (index < newArray.length) {      
          newArray[index] = input.nextInt();
          if (newArray[index] < minimumValue) minimumValue = newArray[index] ;
          index++; 
          }
          System.out.println("\nThe minimum element in the array " +  Arrays.toString(newArray) + " is " + minimumValue);
        }
         
} 
