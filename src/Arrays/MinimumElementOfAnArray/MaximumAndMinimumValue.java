
import java.util.Arrays;

public class MaximumAndMinimumValue {
  public static void main(String... args) {
 
    int[] newArray = {21,44,55,66,77,88,99,13};
    
    int maximumValue = newArray[0];
    int minimumValue = newArray[0];
    
    for (int index = 0; index < newArray.length; index++) {
    if (newArray[index] > maximumValue) maximumValue = newArray[index];
    if (newArray[index] < minimumValue) minimumValue = newArray[index];
    }
    System.out.println("\nThe maximum and minimum values of the array " +  Arrays.toString(newArray) + " are " + maximumValue +
    " and " + minimumValue);
  }
}
