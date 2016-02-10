/*
 * Jainil Sutaria
 * Assignment 2
 * Change Calculator
 */

//import the scanner
import java.util.Scanner;

public class ChangeCalculator {
    
    public static void main(String[] args) {
    	//run the change calculator
    	runChange(args);

    }
    public static void runChange(String[] args) {
    	//create a scanner
    	Scanner myScanner = new Scanner(System.in);
    	//ask the amount of money due
    	System.out.print("How much money is due? ");
		int due = myScanner.nextInt();
		//get how much the customer paid
		System.out.print("How much money did the customer pay? ");
		int paid = myScanner.nextInt();
		//calculate the change due
		int changedue = paid - due;
		String change = calculateChange(changedue);
		//print out the change due
		System.out.println("Change Due:");
		System.out.println(change);
		//check if player wishes to run again
		System.out.print("Do you wish to run this again? (y/n): ");
		again(args);
		myScanner.close();
    }
    public static void again(String[] args) {
    	//create a scanner
    	Scanner nextScanner = new Scanner(System.in);
    	//see if the player wants to run the program again
		String checker = nextScanner.nextLine();
		//if case is yes, then run runChange again
    	if (checker.equalsIgnoreCase("y")) {
    		runChange(args);
    	}
    	//if case is no, then stop the program
    	else if (checker.equalsIgnoreCase("n")) {
    		System.exit(0);
    	}
    	//if the value is anything else, re-run the checker to see if the person wants to run the program again
    	else {
    		System.out.print("Error, please enter only y/n: ");
    		again(args);
    	}
    	nextScanner.close();
    }
    
    public static String calculateChange(int totalChange) {
    	//reset the values of the change
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        //check if there is over a dollar worth of change
        while (totalChange >= 100) {
        	dollars = dollars + 1;
        	totalChange = totalChange - 100;	
       	}
        //check if there is over a quarter worth of change
       	while (totalChange >= 25) {
       		quarters = quarters + 1;
       		totalChange = totalChange - 25;	
       	}
       	//check if there is over a dime worth of change
       	while (totalChange >= 10) {
       		dimes = dimes + 1;
       		totalChange = totalChange - 10;	
       	}
       	//check if there is over a nickel worth of change	
       	while (totalChange >= 5) {
    		nickels = nickels + 1;
    		totalChange = totalChange - 5;	
    	}
       	//check if there is over a penny worth of change
       	while (totalChange >= 1) {
    		pennies = pennies + 1;
    		totalChange = totalChange - 1;	
    	}
        

        // returns change information
        return ("Dollars:\t\t" + dollars + "\n" + "Quarters:\t\t" + quarters + 
         "\n" + "Dimes:\t\t\t" + dimes + "\n" + "Nickels:\t\t" + nickels + "\n" 
         + "Pennies:\t\t" + pennies + "\n");
    }
}