import java.util.Arrays;

public class ReversingArrays {
  public static void main(String...args) {
  
    int[] newArray = {5,22,8,10,4,15,7};
    
    int[] reversedArray = reverseArray(newArray);
    
    System.out.println(Arrays.toString(reversedArray));
  }
  public static int[] reverseArray(int[] list) {
  
  int[] reversed = new int[list.length];
  
  for (int index = 0, reverseIndex = list.length -1; index < list.length; index++, reverseIndex--) {
    reversed[index] = list[reverseIndex];
  }
  return reversed;
  }
}
