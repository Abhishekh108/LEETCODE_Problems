class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=0;
        int maxprofit=0;
        int profit=0;
        while(j<prices.length){//buy
            profit=prices[j]-prices[i];
            maxprofit=Math.max(maxprofit,profit);
            if(prices[i]>prices[j]){ //buy ;\less price
                i=j ;
            }
            j++;
            
        }
        return maxprofit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna