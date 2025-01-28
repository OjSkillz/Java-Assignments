import java.util.Arrays;

public class ConcatenatingTwoListsAlternatingly {
  public static void main(String...args) {
  String[] listOne = {"a","b","c"};
  String[] listTwo = {"1","2","3"};
  
  concatenateTwoLists(listOne , listTwo);
  }
  public static void concatenateTwoLists(String[] listOne , String[] listTwo) {
  String[] mergedList = new String[listOne.length + listTwo.length];
  
  for (int indexOne = 0, indexTwo = 0; indexOne < mergedList.length; indexOne+=2, indexTwo++) mergedList[indexOne] = listOne[indexTwo];
  for (int indexOne =1, indexTwo = 0; indexOne < mergedList.length; indexOne+= 2, indexTwo++) mergedList[indexOne] = listTwo[indexTwo];
  System.out.println("\n" + Arrays.toString(listOne) + " and " + Arrays.toString(listTwo) + " concatenated by alternatingly taking elements from both lists -> " + Arrays.toString(mergedList));
  }
}
