import java.util.Scanner;

public class CafeteriaMenuAnalysis {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 INPUT SECTION
        // Input the number of items
        int numMenuItems = 0;
        // Do...while loop for validation
        do {
            System.out.print("Enter the number of menu items: ");
            numMenuItems = scanner.nextInt();
            if (numMenuItems <= 0) {
                System.out.println("Error: Number of menu items must be greater than zero.");
            }
        } while (numMenuItems <= 0);

        // Creates an Array that is set to be the length of what the user entered for number of items.
        int[] purchases = new int [numMenuItems];
        MenuItems[] menuItems = new MenuItems[numMenuItems];
        int totalPurchases = 0;
        
        // Input the number of purchases for each menu item
        // Loop through menu items
        for (int i = 0; i < numMenuItems; i++) {

            // Clear scanner buffer before reading String
            scanner.nextLine();
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            String name = scanner.nextLine();

            // Ask for purchases inside do/while loop to validate. 
            int purchase = 0;
            do {
                // Prompts with index correction
                System.out.print("Enter the number of purchases for item " + (i + 1) + ": ");

                purchase = scanner.nextInt();
                if (purchase <= 0) {
                    System.out.println("Error: Number of purchases must be greater than zero.");
                }
            } while (purchase <= 0);

            // Ask for price - one input, no need for do/while unless you want to validate price too.
            System.out.print("Enter price for " + name + ": ");
            double price = scanner.nextDouble();

            // Now create your MenuItems object and store it
            menuItems[i] = new MenuItems(name, purchase, price);

            purchases[i] = purchase;
            totalPurchases += purchase;
        }

        // 2 PROCSSING SECTION
        // Calculate the average number of purchases
        double averagePurchases = (double) totalPurchases / numMenuItems;
        
        // Determine the most and least popular items
        int maxPurchases = purchases[0];
        int minPurchases = purchases[0];
        int mostPopularItem = 1;
        int leastPopularItem = 1;
        
        for (int i= 1; i < numMenuItems; i++) {
            if (purchases[i] > maxPurchases) {
                maxPurchases = purchases[i];
                mostPopularItem = i + 1;
            }
            if (purchases[i] < minPurchases) {
                minPurchases = purchases[i];
                leastPopularItem = i + 1;
            }
        }

        // Determine the total price
        double totalBill = 0.0;

        for (int i = 0; i < numMenuItems; i++) {
            double itemCost = menuItems[i].getPurchases() * menuItems[i].getPrice();
            totalBill += itemCost;
        }

        // 3 CALCULATIONS
        // Determine the demand level
        String demandLevel;
        if (averagePurchases <= 20) {
            demandLevel = "Low Demand";
        } else if (averagePurchases <= 50) {
            demandLevel = "Moderate Demand";
        } else {
            demandLevel = "High Demand";
        }

        // Create subtotals for each item
        double[] subtotals = new double[numMenuItems];

        for (int i=0; i < numMenuItems; i++) {
            subtotals[i] = menuItems[i].getPurchases() * menuItems[i].getPrice();
        }

        String itemSubtotalsOutput = "------ Item Subtotals ------\n";

        for (int i = 0; i < numMenuItems; i++) {
            itemSubtotalsOutput += menuItems[i].getName() + " - " + 
                                menuItems[i].getPurchases() + " x $" + 
                                String.format("%.2f", menuItems[i].getPrice()) + " = $" + 
                                String.format("%.2f", subtotals[i]) + "\n";
        } 

        // 4 OUTPUT
        // Output the results
        System.out.println("Average purchases = " + averagePurchases);
        System.out.println("Most popular item  = Item " + mostPopularItem);
        System.out.println("Least popular item  = Item " + leastPopularItem);
        System.out.println("Demand is " + demandLevel);
        System.out.println("Total cafeteria bill = $" + String.format("%.2f", totalBill));
        System.out.println(itemSubtotalsOutput);
        scanner.close();
    } // end of main method
} // end of class