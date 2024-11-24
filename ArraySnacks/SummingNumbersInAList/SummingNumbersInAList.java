public class SummingNumbersInAList {
  public static void main(String...args) {
  
    int[] newArray = {100,200,300,400,500};
    sumNumbersWithForLoop(newArray);
    sumNumbersWithWhileLoop(newArray);
    sumNumbersWithDoWhileLoop(newArray);
  
  }  
  
  public static void sumNumbersWithForLoop(int[] list) {
      int sum = 0;
      for (int index = 0; index < list.length; index++) sum += list[index];
      System.out.println("\nSum with for loop is " + sum);
  }
  
  public static void sumNumbersWithWhileLoop(int[] list) {
    int sum = 0;
    int counter = 0;
    while (counter < list.length) {
    sum += list[counter];
    counter++;
    } System.out.println("\nSum with while loop is " + sum);
  }
  
  public static void sumNumbersWithDoWhileLoop(int[] list) {
    int sum = 0;
    int counter = 0;
    do {
    sum += list[counter];
    counter++;
    } while (counter < list.length);
    System.out.println("\nSum with do-while loop is " + sum);
  }   

}
