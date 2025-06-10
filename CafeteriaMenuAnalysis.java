import java.util.Scanner;

public class CafeteriaMenuAnalysis {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1️⃣ INPUT SECTION
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
        int totalPurchases = 0;

        // Input the number of purchases for each menu item
        // Loop through menu items
        for (int i = 0; i < numMenuItems; i++) {
            int purchase = 0;
            do {
                // Prompts with index correction
                System.out.print("Enter the number of purchases for item " + (i + 1) + ": ");

                purchase = scanner.nextInt();
                if (purchase <= 0) {
                    System.out.println("Error: Number of purchases must be greater than zero.");
                }
            } while (purchase <= 0);

            purchases[i] = purchase;
            totalPurchases += purchase;
        }

        // 2️⃣ PROCSSING SECTION
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

        // 3️⃣ CALCULATIONS
        // Determine the demand level
        String demandLevel;
        if (averagePurchases <= 20) {
            demandLevel = "Low Demand";
        } else if (averagePurchases <= 50) {
            demandLevel = "Moderate Demand";
        } else {
            demandLevel = "High Demand";
        }

        // 4️⃣ OUTPUT
        // Output the results
        System.out.println("Average purchases = " + averagePurchases);
        System.out.println("Most popular item  = Item " + mostPopularItem);
        System.out.println("Least popular item  = Item " + leastPopularItem);
        System.out.println("Demand is " + demandLevel);

        scanner.close();

    } // end of main method
} // end of class