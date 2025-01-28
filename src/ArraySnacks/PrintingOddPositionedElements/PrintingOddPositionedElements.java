
public class PrintingOddPositionedElements {
  public static void main(String...args) {
  
     int[] newArray = {5,22,8,10,4,15,7};
     printOddPositionedElements(newArray); 
  
  }
    public static void printOddPositionedElements(int[] list) {

      for (int index = 0; index < list.length; index+=2) {
      System.out.print(list[index] + " ");
      }
    
    }
}
