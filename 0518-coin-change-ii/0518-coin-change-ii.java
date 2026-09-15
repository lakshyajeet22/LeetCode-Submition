class Solution {
    public int solve(int amt, int[] c, int n, Integer[][] dp){
        if(amt==0) return 1;
        if(n==0) return 0;
        if(dp[n][amt]!=null) return dp[n][amt];
        if(c[n-1]<=amt){
            return dp[n][amt] = solve(amt-c[n-1], c, n, dp) + solve(amt, c, n-1, dp);
        }
        return dp[n][amt] = solve(amt, c, n-1, dp);
    }
    public int change(int amt, int[] c) {
        if(amt==0) return 1;
        Integer[][] dp = new Integer[c.length+1][amt+1];
        solve(amt, c, c.length, dp);
         return dp[c.length][amt];
    }
}