import java.util.Scanner;

public class NumberPattern {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter desired number of lines:  ");
    int numberOfLines = input.nextInt();
    
    for (int count = 1; count <= numberOfLines; count++) {
      for(int number = 1; number <= count; number++ ) {
        System.out.print(number);
      } System.out.println();
    }
   for (int count = numberOfLines; count >= 2; count--) {
      for(int number = 1; number <= count -1; number++) {
        System.out.print(number);
      } System.out.println();
    }
  }
}
