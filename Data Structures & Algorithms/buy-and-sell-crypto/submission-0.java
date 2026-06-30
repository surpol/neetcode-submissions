class Solution {
    public int maxProfit(int[] prices) {
        // store maxP
        // store minimumPrice

        // if prices[i] - minimum price > maxP
            // reassign
        // if prices[i] < minimum price
            // reassign

        int maxP = 0;
        int minP = prices[0];
        for (int sell: prices) {
            int profit = sell - minP;
            if (profit > maxP) {
                maxP = profit;
            }
            if (sell < minP) {
                minP = sell;
            }
        }
        return maxP;
    }
}
