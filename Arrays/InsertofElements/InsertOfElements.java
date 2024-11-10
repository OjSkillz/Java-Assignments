import java.util.Scanner;
import java.util.Arrays;

public class InsertOfElements {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int[] newArray = {21,44,55,66,77,88,99,13};
    
    System.out.print("\nChoose an element to insert it into your preferred position in the following array :" +
    Arrays.toString(newArray));
    
    System.out.print("\nElement: ");
    int arrayElement = input.nextInt();
    
    System.out.print("\nPosition: ");
    int arrayPosition = input.nextInt();
    
    newArray[arrayPosition -1] = arrayElement;
    
    System.out.println("\nNew array with specified element and position is " +  Arrays.toString(newArray));
  }
}
