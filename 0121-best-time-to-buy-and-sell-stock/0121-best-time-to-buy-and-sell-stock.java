class Solution {
    public int maxProfit(int[] prices) {
        int  maxP=0, min=prices[0];
        for(int i : prices){
            if(min>i){
                min=i;
            }
            maxP=Math.max(i-min, maxP);
        }return maxP;
    }
    
}