// Shaan Dave 
// Rock Paper Scissors 

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
	
	public static void main(String[] args) {
		
		//Introduce variables
		int x;
		int z;
		int a = 0;
		int b = 0;
		
		//scanner and random
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//Multiple rounds
		while(a < 5 && b < 5) {
		//
		//User input
		System.out.println("Enter 0 for rock, 1 for paper, and 2 for scissors");
		x = scan.nextInt();
		
		
		//Computer input
		z = ran.nextInt(3);
	
	// Output statements
	//public static String outcome(int x, int z) {
		
		if (x == 0 && z == 0) {
			System.out.println("Both are rock. It's a tie!");
			
		}
		else if (x == 1 && z == 0) {
			System.out.println("Paper beats rock. You win!");
			a ++;
		}
		else if (x == 2 && z == 0) {
			System.out.println("Rock beats scissors. You lose!");
			b++;
		}
		else if (x == 0 && z == 1) {
			System.out.println("Paper beats rock. You lose!");
			b++;
		}
		else if (x == 1 && z == 1) {
			System.out.println("Both are paper. It's a tie!");
		}
		else if (x == 2 && z == 1) {
			System.out.println("Scissors beats paper. You win!");
			a++;
		}
		else if (x == 0 && z == 2) {
			System.out.println("Rock beats scissors. You win!");
			a++;
		}
		else if (x == 1 && z == 2) {
			System.out.println("Scissors beats paper. You lose!");
			b++;
		}
		else if (x == 2 && z == 2) {
			System.out.println("Both are scissors. It's a tie!");
		}
		else if (x > 2) {
			System.out.println("That's not an option!");
		}
		System.out.println("score is " + a + " to " + b);
			
		
		}
		scan.close();
		if (a >= 5) {
			System.out.println("You win!");
		}
			else if (b >= 5) {
				System.out.println("You Lose!");
			}
			}
			
		
		
	
}
		
	
	
	
	
	

