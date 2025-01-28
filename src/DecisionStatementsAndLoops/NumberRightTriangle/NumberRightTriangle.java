import java.util.Scanner;

public class NumberRightTriangle {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter desired number of lines:  ");
    int numberOfLines = input.nextInt();
    
    for (int count = 1; count <= numberOfLines; count++) {
      for(int number = count; number <= count +1; number+= count ) {
        System.out.print(number);
      } System.out.println();
    }
  }
}
