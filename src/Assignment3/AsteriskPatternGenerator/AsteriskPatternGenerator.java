
public class AsteriskPatternGenerator {
  public static void main(String[] args) {
    
    String firstHeader = "Pattern A", secondHeader = "Pattern B";
    String thirdHeader = "Pattern C", fourthHeader = "Pattern D";
    
   
    System.out.printf("%s%n", firstHeader);
    for (int counter = 1; counter <= 7; counter++) {
       for (int count = 1; count < counter; count++) {
        System.out.print("*");
       } System.out.println();
    }
    
    for (int space = 1; space <= 7; space++) {
      for (int spacer = 1; spacer < space; spacer++) {
        System.out.print("  *");
      } System.out.println();
    }  
  } 
}
