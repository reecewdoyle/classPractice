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
        // 3️⃣ CALCULATIONS
        // 4️⃣ OUTPUT


    } // end of main method
} // end of class