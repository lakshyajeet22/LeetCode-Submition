class Solution {
    static int solve(int t, int[] arr, int n, Integer[][] dp){
          if (n == 0)
              return t == 0 ? 1 : 0;
           if(dp[n][t]!=null) return dp[n][t];
          if(t>=arr[n-1]){
              return dp[n][t] = solve(t-arr[n-1], arr, n-1, dp)+solve(t, arr, n-1, dp);
          }
          return dp[n][t]=solve(t, arr, n-1, dp);
       }
    public int findTargetSumWays(int[] arr, int diff) {
        int sum=0;
                for(int i : arr) sum+=i;
                if((sum+diff)%2!=0) return 0;
                int t = (sum+diff)/2;
                if (Math.abs(diff) > sum) return 0;
               Integer[][] dp = new Integer[arr.length+1][t+1];
                       solve(t, arr, arr.length, dp);
                      return dp[arr.length][t]; 
    }
}