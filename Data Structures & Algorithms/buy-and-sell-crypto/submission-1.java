class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<minimum){
                minimum=prices[i];
                System.out.println("minimum updated to "+ minimum);
            }
            if(maxProfit<prices[i]-minimum){
                maxProfit = prices[i]-minimum;
                System.out.println("maxProfit updated to "+ maxProfit);
            }
        }
        return maxProfit;
    }
}
