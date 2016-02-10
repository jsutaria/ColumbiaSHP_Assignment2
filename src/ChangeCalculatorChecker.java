public class ChangeCalculatorChecker {
    private static int totalTestsCount = 0;
    private static int passingTestsCount = 0;

    public static void main(String[] args) {
        System.out.println("--- Running Tests ---");
        
        int dollars = 20;
        int quarters = 0;
        int dimes = 1;
        int nickels = 0;
        int pennies = 3;
        
        String expected = "Dollars:\t\t" + dollars + "\n" + "Quarters:\t\t" + quarters + 
                "\n" + "Dimes:\t\t\t" + dimes + "\n" + "Nickels:\t\t" + nickels + "\n" 
                + "Pennies:\t\t" + pennies + "\n";

        assertEquality(ChangeCalculator.calculateChange(2013), 
            expected, "Test01");
        
        dollars = 9;
        quarters = 1;
        dimes = 1;
        nickels = 1;
        pennies = 0;
        
        expected = "Dollars:\t\t" + dollars + "\n" + "Quarters:\t\t" + quarters + 
            "\n" + "Dimes:\t\t\t" + dimes + "\n" + "Nickels:\t\t" + nickels + "\n" 
            + "Pennies:\t\t" + pennies + "\n";

        assertEquality(ChangeCalculator.calculateChange(940), 
            expected, "Test02");
        
        dollars = 0;
        quarters = 0;
        dimes = 1;
        nickels = 1;
        pennies = 0;
        
        expected = "Dollars:\t\t" + dollars + "\n" + "Quarters:\t\t" + quarters + 
            "\n" + "Dimes:\t\t\t" + dimes + "\n" + "Nickels:\t\t" + nickels + "\n" 
            + "Pennies:\t\t" + pennies + "\n";

        assertEquality(ChangeCalculator.calculateChange(15), 
            expected, "Test03");
        
        dollars = 0;
        quarters = 0;
        dimes = 0;
        nickels = 0;
        pennies = 0;
        
        expected = "Dollars:\t\t" + dollars + "\n" + "Quarters:\t\t" + quarters + 
            "\n" + "Dimes:\t\t\t" + dimes + "\n" + "Nickels:\t\t" + nickels + "\n" 
            + "Pennies:\t\t" + pennies + "\n";
        
        assertEquality(ChangeCalculator.calculateChange(0), 
            expected, "Test04");

        assertEquality(ChangeCalculator.calculateChange(-15), 
            expected, "Test05");

        System.out.println(passingTestsCount + "/" + 
            totalTestsCount + " tests passed.");
    }

    private static void assertEquality(String actual, String expected, 
        String testName) {
        
        totalTestsCount++;
        System.out.print(testName);
        
        if(actual.equals(expected)) {
            passingTestsCount++;
            System.out.println(" -- Passed\n");
        }
        else {
            System.out.println(" -- Failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual + "\n");
        }
    }
}