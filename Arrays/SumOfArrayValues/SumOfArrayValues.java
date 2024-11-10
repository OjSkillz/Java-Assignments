
public class SumOfArrayValues {
  public static void main(String... args) {

    
  int total = 0;
  
  int[] myArray = {5,4,3,2,1};
  
  for (int value = 0; value < myArray.length; value++) {
  
  total = total + myArray[value];
  }
  System.out.println("\n" + total);
  }
}
