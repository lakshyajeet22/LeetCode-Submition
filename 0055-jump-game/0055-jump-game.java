class Solution {
    boolean solve(int[] nums, int i, Boolean[] dp){
        if(i>nums.length-1) return false;
        if(dp[i]!=null) return dp[i];
        if(i==nums.length-1) return true;
        if(nums[i]==0) return false;
        boolean ans = false;
        for(int j=nums[i]; j>0; j--){
            ans = (solve(nums, i+j, dp)) ;
            if(ans)
                break;    
        }
        return dp[i]=ans;
    }
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length+1];
        if(solve(nums, 0, dp))  return true;
        return false;
    }
}