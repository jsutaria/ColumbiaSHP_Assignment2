import java.util.Scanner;

public class StatisticsTester {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("How many values do you wish to enter?: ");
		int length = myScanner.nextInt();
		double[] myarray = new double[length];
		for (int x = 0; x < length; x++) {
			System.out.print("Enter Value " + (x+1) +": ");
			myarray[x] = myScanner.nextDouble();
		}
		System.out.println("Max: "+ Statistics.max(myarray));
		System.out.println("Min: "+ Statistics.min(myarray));
		System.out.println("Mean: "+ Statistics.mean(myarray));
		System.out.println("Median: "+ Statistics.median(myarray));
		System.out.println("Mode: "+ Statistics.mode(myarray));
		System.out.println("Standard Deviation: " + Statistics.sd(myarray));
		System.out.println("Range: " + Statistics.range(myarray));
		myScanner.close();
		
	}
}
