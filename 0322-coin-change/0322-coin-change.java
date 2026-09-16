class Solution {

    public int solve(int amt, int[] c, int n, Integer[][] dp) {

        if (amt == 0)
            return 0;

        if (n == 0)
            return Integer.MAX_VALUE;

        if (dp[n][amt] != null)
            return dp[n][amt];

        if (c[n - 1] <= amt) {

            int take = solve(amt - c[n - 1], c, n, dp);

            if (take != Integer.MAX_VALUE)
                take++;

            int notTake = solve(amt, c, n - 1, dp);

            return dp[n][amt] = Math.min(take, notTake);
        }

        return dp[n][amt] = solve(amt, c, n - 1, dp);
    }

    public int coinChange(int[] c, int amt) {

        if (amt == 0)
            return 0;

        Integer[][] dp = new Integer[c.length + 1][amt + 1];

        int ans = solve(amt, c, c.length, dp);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}