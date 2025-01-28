import java.util.Scanner;

public class BasicTextMenu {
  public static  void  main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int userResponse = 0;
    
    while (userResponse != 4) {
      System.out.print("""
      Select one option (Type 1 or 2 or...):
      
      1) Add
      2) View
      3) Delete
      4) Quit
      
      """);
      userResponse = input.nextInt();
      
      switch (userResponse) {
        case 1: System.out.println("\nYou have selected 1): Add");
        break;
        case 2: System.out.println("\nYou have selected 2): View");
        break;
        case 3: System.out.println("\nYou have selected 3): Delete");
        break;
       }
    }
  }
}
