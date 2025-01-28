import java.util.Scanner;

public class LifeStages {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter age: ");
    int userAge = input.nextInt();
    
    if (userAge <= 12) {
    System.out.println("\nchild");
    }
    else if ( userAge <= 13 && userAge <= 17) {
    System.out.println("\nteen");
    }
    else if (userAge <= 18 && userAge <= 64) {
    System.out.println("\nadult");
    }
    else System.out.println("\nsenior");
 }
}
