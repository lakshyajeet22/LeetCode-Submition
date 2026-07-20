class Solution {
    public static int rec(int n, int[] dp){
        if(n<=3) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]=rec(n-1, dp) + rec(n-2, dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        Arrays.fill(dp, -1);
        return rec(n,dp);
    }
}