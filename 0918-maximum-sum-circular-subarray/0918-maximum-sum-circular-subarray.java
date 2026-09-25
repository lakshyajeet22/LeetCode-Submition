class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int maxSum  = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int ttlSum=0;
        for(int i : nums){
            sum+=i;
            ttlSum+=i;
            maxSum=Math.max(sum, maxSum);
            if(sum<0) sum=0;
        
        }
        sum=0;
        for(int i : nums){
            sum+=i;
             minSum=Math.min(sum, minSum);
            if(sum>0) sum=0;
        }
        if(ttlSum<0 && minSum==ttlSum) return maxSum;
        return Math.max(maxSum, ttlSum-minSum);

    }
}