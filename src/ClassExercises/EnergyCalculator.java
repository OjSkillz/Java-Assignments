package ClassExercises;

import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
	System.out.print("\nEnter the amount of water in Kg: ");
	double amountOfWaterInKg = input.nextDouble();
	
	System.out.print("\nEnter the initial temperature in deg.C: ");
	double initialTemperature = input.nextDouble();

	System.out.print("\nEnter the final temperature in deg.C: ");
	double finalTemperature = input.nextDouble();
	
	double energyNeeded = amountOfWaterInKg * (finalTemperature - initialTemperature) * 4184;
	
	System.out.printf("%nThe energy needed is %.1fJ%n", energyNeeded); 
	
   }
}