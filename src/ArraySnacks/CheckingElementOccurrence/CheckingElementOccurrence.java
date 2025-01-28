public class CheckingElementOccurrence {
    
    public static void checkElementInArray(int[] list, int element) {
      for (int index = 0; index < list.length; index++) {
        if (element == list[index]) System.out.println("True"); 
        else System.out.println("False"); 
       break;
    }   
    }
  
  public static void main(String...args) {
   int[] newArray = {5,22,8,10,4,15,7};
   int element = 5;
  checkElementInArray(newArray, element);
   
  }

}
