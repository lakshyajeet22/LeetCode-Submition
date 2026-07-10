class Solution {
    public int maxProfit(int[] prices) {
        int max=0, min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i+1]-min>max){
                max=prices[i+1]-min;
            }
        }return max;

    }
}