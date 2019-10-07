/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Max Gordon
 * @version 10/3/19
 */
// ═ ╗ ║ ╝ ╔ ╚
public class CurrencyV1 {
    public static void main(String[] args) {
        // Message to user stating purpose
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║ This program converts an amount of money         ║");
        System.out.println("║ from a specific country into the equivalent      ║");
        System.out.println("║ currency of another country given the current    ║");
        System.out.println("║ exchange rate.                                   ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println();

        // Start sequence
        double MoneyUSD = 6500.0;

        System.out.println("Starting USD............................" + MoneyUSD);
        System.out.println();
        System.out.println();

        // Lesotho
        double maLotiSpent = 23083.15;
        double maLotiToUSD = maLotiSpent * 0.066;
        MoneyUSD -= maLotiToUSD;

        System.out.println("Lesotho:");
        System.out.println(" maLoti Spent..........................." + maLotiSpent);
        System.out.println(" USD Equivalent........................." + maLotiToUSD);
        System.out.println(" USD Left..............................." + MoneyUSD);
        System.out.println();

        // Benin
        double CFAFranksSpent = 1791873.78;
        double CFAFranksToUSD = CFAFranksSpent * 0.00167415;
        MoneyUSD -= CFAFranksToUSD;

        System.out.println("Benin:");
        System.out.println(" CFA Franks Spent......................." + CFAFranksSpent);
        System.out.println(" USD Equivalent........................." + CFAFranksToUSD);
        System.out.println(" USD Left..............................." + MoneyUSD);
        System.out.println();

        // Nauru
        double AustralianDollarsSpent = 2667.91;
        double AustralianDollarsToUSD = AustralianDollarsSpent * 0.672667;
        MoneyUSD -= AustralianDollarsToUSD;

        System.out.println("Nauru:");
        System.out.println(" Australian Dollars Spent..............." + AustralianDollarsSpent);
        System.out.println(" USD Equivalent........................." + AustralianDollarsToUSD);
        System.out.println(" USD Left..............................." + MoneyUSD);
        System.out.println();
        
        // Start the Souvenir purchases
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                                                  ║");
        System.out.println("║    Souvenir Purchases                            ║");
        System.out.println("║      (all values in US Dollars)                  ║");
        System.out.println("║                                                  ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println("");
        System.out.println("");


		//Calculations for Coffee
		int costCoffee = 16;  					        	     //cost per item of first souvenir
		int budgetCoffee = 120;   					          	 //budget for first item
		int totalCoffee = budgetCoffee / costCoffee; 		     //how many items can be purchased
		int fundsRemainingCoffee = budgetCoffee % costCoffee;    //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item........................$" + costCoffee);
		System.out.println("   Budget...............................$" + budgetCoffee);
		System.out.println("   Total items purchased................" + totalCoffee);
		System.out.println("   Funds remaining......................$" + fundsRemainingCoffee);
     	System.out.println();

		//Calculations for Key chain
		double costKeyChain = 9.99;  						//cost per item of second souvenir
		int budgetKeyChain = 105;   							//budget for second item
		int totalItemsKeyChain = (int)(budgetKeyChain / costKeyChain); 	//how many items can be purchased
		double fundsRemainingKeyChain = (double)budgetKeyChain % costKeyChain;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item........................$" + costKeyChain);
		System.out.println("   Budget...............................$" + budgetKeyChain);
		System.out.println("   Total items purchased................" + totalItemsKeyChain);
		System.out.println("   Funds remaining......................$" + fundsRemainingKeyChain);
    }
}