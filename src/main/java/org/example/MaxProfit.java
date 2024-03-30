package org.example;

/**
 * Given we have two arrays for current stock price and stock price after 5 years.
 * And some amount in our wallet
 * Then we need to find buy the max profitable stock
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] todayPrice = {10, 20, 30, 40, 50, 15, 25, 35};
        int[] priceAfter5years = {20, 100, 5, 45, 50, 105, 125, 135};
        int totalAmount = 35;

        System.out.println(findMaxProfit(todayPrice,priceAfter5years,totalAmount));
    }

    private static int findMaxProfit(int[] todayPrice, int[] priceAfter5years, int totalAmount) {
        int maxProfit = 0;
        for(int i=0;i<todayPrice.length;i++){
            if(todayPrice[i]<=totalAmount){
                int remainingAmount = totalAmount - todayPrice[i];
                int profit = priceAfter5years[i]-todayPrice[i];

                int remainingProfit = profit + findMaxProfit(todayPrice,priceAfter5years,remainingAmount);

                if(remainingProfit>maxProfit){
                    maxProfit = remainingProfit;
                }
            }
        }
        return maxProfit;
    }
}
