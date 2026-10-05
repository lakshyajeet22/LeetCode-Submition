class Solution {

    public int solve(Integer[] dp, int[] arr, int i){
        if(i>=arr.length) return 0;
        if(dp[i]!=null) return dp[i];
        int ans =arr[i]+ Math.min(solve(dp, arr, i+1),solve(dp, arr, i+2));
        return dp[i]=ans;
    }
    public int minCostClimbingStairs(int[] cost) {
        Integer[] dp = new Integer[cost.length+1];
       return Math.min(
            solve(dp, cost, 0),
            solve(dp, cost, 1)
        );
    }
}