class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, maxS=Integer.MIN_VALUE;
        for(int i : nums){
            sum+=i;
            maxS=Math.max(maxS, sum);
            if(sum<0) sum=0;
        }return maxS;
    }
}