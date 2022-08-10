package CodingProblems;

// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        // setting int for return
        int mostWealth = 0;

        //Customer Loop
        for (int i = 0; i < accounts.length; i++) {
            //Setting a var to track each customers wealth, resets to zero on next
            int customerWealth = 0;

            // Account Loop
            for (int j = 0; j < accounts[i].length; j++) {
                // Keep accumulating wealth from all accounts.
                customerWealth = customerWealth + accounts[i][j];

                //Set mostWealth to highest number.
                if(customerWealth > mostWealth) {
                    mostWealth = customerWealth;
                }
            }
        }
        return mostWealth;
    }
}