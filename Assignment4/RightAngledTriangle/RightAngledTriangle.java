import java.util.Scanner;

public class RightAngledTriangle {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter the length of the base of a triangle between 1 and 10: ");
    int baseLength = input.nextInt();
    
    if (baseLength > 0 && baseLength <= 10) {
    baseLength++;
    System.out.print("\nHere is a right-angled triangle composed of asterisks and" +
          " of the specified base length: \n");
      for(int column = 0; column < baseLength; column++) {
        for(int row = 1; row <= column; row++){
          System.out.print("*");
        }
        System.out.println();
      }
    } else System.out.print("\nLength of base out of range!\n");
  }
}
