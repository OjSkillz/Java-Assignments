import java.util.Scanner;

public class CompoundInterestCalculator {
  public static void main (String... args) {
    
     
     
    System.out.println( "Compound Interest Calculator");
    
    System.out.println("Determine how much your money can grow using the power of compound interest.\n\n* DENOTES "
    + "A REQUIRED FIELD");
    
    displayFields();
    }
   
   
    static Scanner input = new Scanner(System.in);
    
    public static void displayFields() {
      
     CompoundInterest compoundInterest = new CompoundInterest();
        
    System.out.println("\nStep 1: Initial Investment\nInitial Investment * ");
    System.out.print("Amount of money that you have available to invest initially >>> ");
    double principal = input.nextDouble();
    compoundInterest.setPrincipal(principal);
    
    System.out.println("\nStep 2: Contribute\nMonthly Contribution");
    System.out.print("Amount that you plan to add to the principal every month, or a negative\nnumber for the amount" + 
    " that you plan to withdraw every month,\nor 0 for neither deposit nor withdrawal >>> ");
    double monthlyContribution = input.nextDouble();
    compoundInterest.setMonthlyContribution(monthlyContribution);
    
    System.out.println("\nLength of Time In Years *");
    System.out.print("Length of time, in years, that you plan to save >>> ");
    int duration = input.nextInt();
    compoundInterest.setDuration(duration);
    
    System.out.println("\nStep 3: Interest Rate\nEstimated Interest Rate * ");
    System.out.print("Your estimated annual interest rate in %  >>> ");
    double interestRate = input.nextDouble();
    compoundInterest.setInterestRate(interestRate);
    
    System.out.println("\nStep 4: Compound It\nCompound Frequency\n");
    System.out.print("""
    Times per year that interest will be compounded :  1️⃣ Daily
    \t\t\t\t\t\t   2️⃣ Monthly
    \t\t\t\t\t\t   3️⃣ Quarterly
    \t\t\t\t\t\t   4️⃣ Semi-Annually
    \t\t\t\t\t\t   5️⃣ Annually
    \t\t\t\t\t\t   >>>\t""");
    int frequency = input.nextInt();
    compoundInterest.setFrequency(frequency);
      
      System.out.println("All Entries Sucessfully Recorded.");
      System.out.print(""" 
      \nReady to calculate your compound interest?  1️⃣ CALCULATE
      \t\t\t\t\t    2️⃣ RESET
      \t\t\t\t\t    >>>\t""");
      int choice = input.nextInt();
    
      switch (choice) {
      case 1: compoundInterest.getFutureValue();
      break;
    
      case 2: System.out.println("All Entries Cleared. Ready To Go Again? \n"); 
      displayFields();
      
      break;
      
      default : System.out.println("Invalid Selection! Try again later...");
      
      }
    }
        
  }

