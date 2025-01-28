import java.util.Arrays;

public class ComputingRunningTotal {
  public static void main(String...args) {
  
  int[] newArray = {100,200,300,400,500};
  computeRunningTotals(newArray);
  }
  
  public static void computeRunningTotals(int[] list) {
 
  int[] runningTotals = new int[list.length];
  runningTotals[0] = list[0];
  for (int index = 1; index < list.length; index++) runningTotals[index] =  runningTotals[index-1] + list[index];
  System.out.println("\nThe running totals of the array " + Arrays.toString(list) + " are " + Arrays.toString(runningTotals));
  
  }
}
