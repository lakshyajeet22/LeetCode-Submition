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
        static void swap(char[] arr, int i, int j){
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
    public int minInsertions(String s1) {
        char[] arr = s1.toCharArray();
              int i=0, j=arr.length-1;
              while(i<j){
                  swap(arr, i, j);
                  i++;
                  j--;
              }
              String s2 = new String(arr);
        Integer[][] dp = new Integer[s1.length()+1][s2.length()+1];
                solve(s1.length(), s2.length(), s1, s2, dp);
                return s1.length()-dp[s1.length()][s2.length()];
    }
}