import java.util.Scanner;

public class CompoundInterestCalculator {
  public static void main (String... args) {
    
     
     
    System.out.println( "Compound Interest Calculator");
    
    System.out.println("Determine how much your money can grow using the power of compound interest.\n\n\u001B[30m\033[1m* DENOTES A REQUIRED FIELD\033[0m");
    
    displayFields();
    }
   
   
    static Scanner input = new Scanner(System.in);
    
    public static void displayFields() {
      
     CompoundInterest compoundInterest = new CompoundInterest();
        
    System.out.println("\nStep 1: Initial Investment\n\u001B[30m\033[1mInitial Investment\033[0m \u001B[31m*");
    System.out.print("\u001B[30mAmount of money that you have available to invest initially >>> ");
    double principal = input.nextDouble();
    compoundInterest.setPrincipal(principal);
    
    System.out.println("\nStep 2: Contribute\n\033[1mMonthly Contribution\033[0m");
    System.out.print("Amount that you plan to add to the principal every month, or a negative\nnumber for the amount" + 
    " that you plan to withdraw every month,\nor 0 for neither deposit nor withdrawal >>> ");
    double monthlyContribution = input.nextDouble();
    compoundInterest.setMonthlyContribution(monthlyContribution);
    
    System.out.println("\u001B[30m\n\033[1mLength of Time In Years\033[0m \u001B[31m* \u001B[30m");
    System.out.print("Length of time, in years, that you plan to save >>> ");
    int duration = input.nextInt();
    compoundInterest.setDuration(duration);
    
    System.out.println("\nStep 3: Interest Rate\n\033[1mEstimated Interest Rate\033[0m \u001B[31m* \u001B[30m");
    System.out.print("Your estimated annual interest rate in %  >>> ");
    double interestRate = input.nextDouble();
    compoundInterest.setInterestRate(interestRate);
    
    System.out.println("\033[1mInterest rate variance range\033[0m");
    System.out.print("Range of interest rates (above and below the rate set above) that you\ndesire to see results for. >>> ");
    double rateVariance = input.nextDouble();
    
    System.out.println("\nStep 4: Compound It\n\u001B[30m\033[1mCompound Frequency\033[0m\n");
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
      \nReady to calculate your compound interest?         1️⃣ CALCULATE
      \t\t\t\t\t           2️⃣ RESET
      \t\t\t\t\t           >>>\t""");
      int choice = input.nextInt();
    
      switch (choice) {
      case 1: 
            if (rateVariance == 0.00)
      System.out.println("\n\t\u001B[30m\033[1mThe Results Are In\033[0m\nIn " + compoundInterest.getDuration() + 
      " years, you will have #" + String.format("%,.2f", compoundInterest.getFutureValue()));
    
      else 
        System.out.println("\n\t\t\t\u001B[30m\033[1mThe Results Are In\033[0m\nIn " + compoundInterest.getDuration() +
        " years, you will have #" + String.format("%,.2f", compoundInterest.getFutureValue()) + " [#" + String.format("%,.2f",+
        compoundInterest.getFutureValueAboveRange(rateVariance)) + " for interest rate " +
        " variance above (" + String.format("%.2f", compoundInterest.getInterestRate() + rateVariance) + "%) and #" +
        String.format("%,.2f", compoundInterest.getFutureValueBelowRange(rateVariance)) + " for interest rate variance" +
        " below (" + String.format("%,.2f", compoundInterest.getInterestRate() - rateVariance)  + "%)]");

      break;
    
      case 2: System.out.println("All Entries Cleared. Ready To Go Again? \n"); 
      displayFields();
      
      break;
      
      default : System.out.println("Invalid Selection! Try again later...");
      
      }
    }
        
  }

