import java.util.Arrays;

public class ConcatenatingTwoLists {
  public static void main(String...args) {
  String[] listOne = {"a","b","c"};
  String[] listTwo = {"1","2","3"};
  
  concatenateTwoLists(listOne , listTwo);
  }
  public static void concatenateTwoLists(String[] listOne , String[] listTwo) {
  String[] mergedList = new String[listOne.length + listTwo.length];
  
  for (int index = 0; index < listOne.length; index++) mergedList[index] = listOne[index];
  for (int indexOne = listTwo.length, indexTwo = 0; indexOne < mergedList.length; indexOne++, indexTwo++) mergedList[indexOne] = listTwo[indexTwo];
  System.out.println("\n" + Arrays.toString(listOne) + " and " + Arrays.toString(listTwo) + " concatenated -> " + Arrays.toString(mergedList));
  }
}
