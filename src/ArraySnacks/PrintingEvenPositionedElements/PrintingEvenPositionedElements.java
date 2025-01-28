
public class PrintingEvenPositionedElements {
  public static void main(String...args) {
  
     int[] newArray = {5,22,8,10,4,15,7};
     printEvenPositionedElements(newArray); 
  
  }
    public static void printEvenPositionedElements(int[] list) {

      for (int index = 1; index < list.length; index+=2) {
      System.out.print(list[index] + " ");
      }
    
    }
}
