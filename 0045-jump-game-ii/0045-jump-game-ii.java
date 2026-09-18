class Solution {
    
    int solve(int[] nums, int i, Integer[] dp ){
        int ans=Integer.MAX_VALUE;
        if(i>=nums.length-1) return 0;
        if(dp[i]!=null) return dp[i];
        for(int j=1; j<=nums[i]; j++){
            int next = solve(nums, i+j, dp);
            if(next!=Integer.MAX_VALUE)
                dp[i]=ans = Math.min(ans, 1+next);
        }
        return  dp[i] = ans;
    }
    public int jump(int[] nums) {
        Integer[] dp = new Integer[nums.length+1];
        return solve(nums, 0, dp);
    }
}