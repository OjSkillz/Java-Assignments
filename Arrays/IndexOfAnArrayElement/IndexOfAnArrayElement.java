import java.util.Scanner;
import java.util.Arrays;

public class IndexOfAnArrayElement {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int[] newArray = {21,44,55,66,77,88,99,13};
    
    System.out.print("\nChoose an element from the following array " + Arrays.toString(newArray) + " to find its index:  ");
    int arrayElement = input.nextInt();
    
    for (int index = 0; index < newArray.length; index++){
    if (newArray[index] == arrayElement) System.out.println("\n" + arrayElement + "'s index in array " + Arrays.toString(newArray) +
    " is " + index);
    }
    
  
  
  }
}
