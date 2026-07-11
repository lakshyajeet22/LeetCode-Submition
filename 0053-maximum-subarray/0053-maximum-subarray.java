class Solution {
    public int maxSubArray(int[] nums) {
        int  sum=0, maxS=nums[0];
        for(int i : nums){
            sum+=i;
            maxS=Math.max(sum, maxS);
            if(sum<0) sum=0;

        }return maxS;
    }
}