class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int p = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buy < prices[i]) {
                if (prices[i] - buy > p) {
                    p = prices[i] - buy;
                }

            } else {
                buy = prices[i];
            }
        }
        return p;
    }
}