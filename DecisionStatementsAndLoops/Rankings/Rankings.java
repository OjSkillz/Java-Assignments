import java.util.Scanner;

public class Rankings {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a rank between 1 and 4: ");
    int rankNumber = input.nextInt();
    
    switch (rankNumber) {
     case 1: System.out.println("\nGold");
     break;
     case 2: System.out.println("\nSilver");
     break; 
     case 3: System.out.println("\nBronze");
     break;
     case 4: System.out.println("\nParticipant ribbon");
     break;
    default: System.out.println("\nIllegal rank, beware!");
    
    }
  }
}
