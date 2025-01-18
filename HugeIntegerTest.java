import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import java.util.Arrays;


public class HugeIntegerTest {
  public static void main(String... args) {
   
    System.out.println("\t\t\tTESTING HUGE INTEGERS 💯\nA Huge Integer In This Context Is One With As Many As 40 Digits And " +
    "Not Less Than 20 Digits");
    
    mainMenu() ;
  }
 static Scanner input = new Scanner(System.in);
static List<String> hugeIntegers = new ArrayList<String>();

public static void mainMenu() {
    System.out.print("""
    1️⃣ Save New Huge Integer
    2️⃣ Add
    3️⃣ Subtract
    4️⃣ Multiply
    5️⃣ Divide
    6️⃣ Find Remainder
    7️⃣ Compare
    8️⃣ Exit
    
    >>> """); 
    int selection = input.nextInt();
    input.nextLine();
    
    switch (selection) {
      case 1: 
        
        
        System.out.println();
        System.out.print("Enter Huge Integer >> ");
        String bigInteger = input.next();
  
        while (bigInteger.length() < 20 || bigInteger.length() > 40) {
        System.out.println("\nInvalid Integer Size! Huge Integer Must Be 20 - 40 Digits Long");
        System.out.print("\nEnter Huge Integer>> ");
        bigInteger = input.next();
        }
        hugeIntegers.add(bigInteger);
        
        System.out.println(">>>>>> Entry Saved <<<<<<");
        
       
        returnMenu();
        
      break;
      
      case 2: 
      
      viewAllEntries();
      addOrMultiply("addition");
      
      HugeInteger object = new HugeInteger();
      BigInteger result = object.add(addOrMultiply("addition"));
        System.out.println("The sum of all selected huge integers = " + result);
        returnMenu();
      break; 
      
      case 3 : 
        viewAllEntries();
       List<Integer>  options = new ArrayList<>();
        List<BigInteger> addOptions = new ArrayList<BigInteger>();
        
 
        System.out.println("Enter the numbers corresponding to the huge integer you want to select for subtraction in the order" +
        " (a - b) ");
        System.out.print("a >>> ");
        int a = input.nextInt();
        options.add(a);
        
        System.out.print("b >>> ");
        int b = input.nextInt();
        options.add(b);
        for (Integer option: options) {
        BigInteger integer = new BigInteger(hugeIntegers.get(option - 1));
        addOptions.add(integer);
        }
        
        object = new HugeInteger();
        System.out.println(hugeIntegers.get(a -1) + " - " +  hugeIntegers.get(b -1) + " = " + object.subtract(addOptions));
        returnMenu();
      break;
      
      case 4 : 
       viewAllEntries();
       break;
    }
  }
  
  public static void returnMenu() {
    System.out.println();
    System.out.print("""
        1️⃣ Back To Main Menu
        2️⃣ Exit
        
        >>> """);
        int selection = input.nextInt();
        input.nextLine();
        
        switch (selection) {
          case 1: mainMenu();
          break;
          
          case 2: break;
          
          default: System.out.println("Invalid Selection! Try Again Later");
        }
  }
  
  public static void viewAllEntries() {
    System.out.println("You have the following huge integers saved :");
        for (int index = 0; index < hugeIntegers.size(); index++) 
            System.out.println(index + 1 + ". " + hugeIntegers.get(index));
        System.out.println();
  }
  
  public static List<BigInteger> addOrMultiply(String operation) {
        
        List<Integer> options = new ArrayList<>();
        List<BigInteger> addOptions = new ArrayList<>();
        
        int endSelection = 0;
        System.out.println("Enter the numbers corresponding to the huge integer you want to select for addition followed by ↩️" +
        "\nor \"0\" to stop selecting");
        System.out.print(">>> ");
        int choice = input.nextInt();
        
        while (choice != endSelection) {
        options.add(choice); 
        System.out.print(">>> ");
        choice = input.nextInt();
        } 
      
        for (Integer option: options) {
          BigInteger integer = new BigInteger(hugeIntegers.get(option - 1));
        addOptions.add(integer);
        }
    return addOptions;
  } 

}

