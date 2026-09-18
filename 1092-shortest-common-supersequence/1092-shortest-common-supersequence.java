class Solution {
    static int solve(int n, int m, String s1, String s2, Integer[][] dp){
            if(n==0 || m==0){
                return 0;
            }
            if(dp[n][m]!=null) return dp[n][m];
            if(s1.charAt(n-1)==s2.charAt(m-1)) {
                return dp[n][m]=1+ solve(n-1, m-1, s1, s2, dp);
            }
            return dp[n][m]=Math.max(solve(n-1, m, s1, s2, dp), solve(n, m-1, s1, s2, dp));
        }
         static String shortestCommonSupersequences(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Filling the dp table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Constructing the shortest supersequence
        int i = m, j = n;
        StringBuilder result = new StringBuilder();
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                result.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                result.append(s1.charAt(i - 1));
                i--;
            } else {
                result.append(s2.charAt(j - 1));
                j--;
            }
        }

        // Adding remaining characters
        while (i > 0) {
            result.append(s1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            result.append(s2.charAt(j - 1));
            j--;
        }

        return result.reverse().toString();
    }
    public String shortestCommonSupersequence(String s1, String s2) {
         return shortestCommonSupersequences(s1, s2);
                 
                 

    }
}