import java.util.Scanner;

public class CompoundInterest {
   
  private double principal;
  private int duration;
  private double interestRate;
  private double monthlyContribution;
  private int frequency = 1;
  private double futureValue;
  final double PERCENTAGE = 1.0 / 100;  
  final int MONTHS = 12;
  final int QUARTERS = 4;
  final int HALF_YEAR = 2;
  final int DAYS = 365;
  
  Scanner input = new Scanner(System.in);
  
  public void setPrincipal(double principal) {
    while (principal < 0.0) {
      System.out.println("\nInvalid entry! Enter a value greater than 0" );
      System.out.print("Amount of money that you have available to invest initially    >>> ");
      principal = input.nextDouble();
      }
     this.principal = principal;
  }
  
  public void setDuration(int duration) {
  while (duration < 0) {
      System.out.println("\nInvalid entry! Enter a value greater than 0" );
      System.out.print("Length of time, in years, that you plan to save >>> ");
      duration = input.nextInt();
  }
      this.duration = duration;
  }
  
  public void setInterestRate(double interestRate) {
    while (interestRate < 0.0) {
       System.out.println("\nInvalid entry! Enter a value greater than 0" );
       System.out.print("Your estimated annual interest rate in %   >>>  ");
      interestRate = input.nextDouble();
    }
    this.interestRate = interestRate;
  }
  
  public void setMonthlyContribution(double monthlyContribution) {
    this.monthlyContribution = monthlyContribution;
  }
  
  public void setFrequency (int frequency) {
    switch (frequency) {
      case 1 : this.frequency = DAYS;
      break;
  
      case 2 : this.frequency = MONTHS;
      break;
  
      case 3 : this.frequency = QUARTERS;
      break;
    
      case 4: this.frequency = HALF_YEAR;
      break;
      
      case 5: this.frequency = 1;
      break;
      
      default: System.out.println("Invalid Selection! Try again...\n");
      System.out.print("""
    Times per year that interest will be compounded :  1️⃣ Daily
    \t\t\t\t\t\t   2️⃣ Monthly
    \t\t\t\t\t\t   3️⃣ Quarterly
    \t\t\t\t\t\t   4️⃣ Semi-Annually
    \t\t\t\t\t\t   5️⃣ Annually
    \t\t\t\t\t\t   >>>\t""");
    frequency = input.nextInt();
    setFrequency(frequency);
    }
  }
  
  public double getPrincipal() {
    return principal;
  }
  
  public double getInterestRate() {
    return interestRate;
  }
  
  public int getDuration() {
  return duration;
  }
  
  public double getMonthlyContribution() {
  return monthlyContribution;
  }
  
  public int getFrequency() {
  return frequency;
  }
  
  public void getFutureValue() {
    double ratePerFrequency = (getInterestRate() * PERCENTAGE) / getFrequency() ; 
    double frequencyByDuration = getFrequency() * getDuration() ;
    double recurringFactor = Math.pow( ( 1 + ratePerFrequency ) , frequencyByDuration ) ;
    futureValue = (getPrincipal() * recurringFactor ) +  ( getMonthlyContribution() * ( (recurringFactor - 1)  /  ratePerFrequency ) ) ;

    System.out.println("\n        The Results Are In\nIn " + getDuration() + " years, you will have #" + String.format("%,.2f", 
    futureValue));
       
  }
}
