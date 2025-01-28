
public class LargestElement {
  public static void main(String...args) {
    
    int[] newArray = {5,22,8,10,4,15,7};
   
    findLargestElement(newArray);
    
    
    
  }
    public static int findLargestElement(int [] list) {
             int largest = list[0];
          for (int element : list) {
            if (element > largest) largest = element;
          }
          System.out.println(largest);
      return largest;
    }
}
