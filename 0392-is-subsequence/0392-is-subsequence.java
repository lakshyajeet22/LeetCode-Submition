class Solution {

    Boolean[][] dp;

    boolean func(String s, String t, int i, int j) {

        // We matched all characters of s
        if (i == s.length()) {
            return true;
        }

        // t finished but s is still remaining
        if (j == t.length()) {
            return false;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = func(s, t, i + 1, j + 1);
        }

        return dp[i][j] = func(s, t, i, j + 1);
    }

    public boolean isSubsequence(String s, String t) {

        dp = new Boolean[s.length()][t.length()];

        return func(s, t, 0, 0);
    }
}