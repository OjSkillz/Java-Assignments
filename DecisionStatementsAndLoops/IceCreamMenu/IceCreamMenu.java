import java.util.Scanner;

public class IceCreamMenu {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nWelcome to \"Ice Cream Factory🍦🍨\" ");
    System.out.print("""
\nType 1, 2 or 3 to select your preferred dessert: 
1. Ice cream
2. Sundae
3. Shake
      """);
  int dessert = input.nextInt();

  System.out.print("""
Type 1, 2 or 3 to select your preferred flavour: 
1. Chocolate
2. Vanilla
3. Strawberry
                      
      """);
  int flavour = input.nextInt();
  
  switch (dessert) {
    case 1:
      switch (flavour) {
      case 1: System.out.println("\nYou have selected dessert: Ice cream and flavour: Chocolate");
      break;
      case 2: System.out.println("\nYou have selected dessert: Ice cream and flavour: Vanilla");
      break;
      case 3: System.out.println("\nYou have selected dessert: Ice cream and flavour: Strawberry");
      break;
    default: System.out.println("\nInvalid combo. Bye!");
    }
  break;
  case 2: 
     switch (flavour) {
      case 1: System.out.println("\nYou have selected dessert: Sundae and flavour: Chocolate");
      break;
      case 2: System.out.println("\nYou have selected dessert: Sundae and flavour: Vanilla");
      break;
      case 3: System.out.println("\nYou have selected dessert: Sundae and flavour: Strawberry");
      break;
      default: System.out.println("\nInvalid combo. Bye!");
      }
  break;
  case 3: 
    switch (flavour) {
    case 1: System.out.println("\nYou have selected dessert: Shake and flavour: Chocolate");
      break;
      case 2: System.out.println("\nYou have selected dessert: Shake and flavour: Vanilla");
      break;
      case 3: System.out.println("\nYou have selected dessert: Shake and flavour: Strawberry");
      break;
    default: System.out.println("\nInvalid combo. Bye!");
    }
     }

    }
}
