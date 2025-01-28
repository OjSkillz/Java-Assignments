import java.util.Scanner;

public class Thermometer {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter temperature in Celsius: ");
    double temperatureInCelsius = input.nextDouble();
    
    if (temperatureInCelsius < 10) System.out.println("\ncold");
      else if (temperatureInCelsius >= 11 && temperatureInCelsius <= 25) System.out.println("\nwarm");
      else System.out.println("\nhot");
      
  }
 } 
