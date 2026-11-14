class Solution {
    boolean solve(char[][] b , String s, int i , int j, int k){
        if(k==s.length()) return true;
        if(i<0 || j<0 || j>=b[0].length || i>=b.length) return false;

        boolean ans = false;
        if(b[i][j]==s.charAt(k)){
            char a = b[i][j];
            b[i][j]='.';
            ans = solve(b, s, i+1, j, k+1) || solve(b, s, i, j+1, k+1) || solve(b, s, i-1, j, k+1) || solve(b, s, i, j-1, k+1);
            b[i][j]=a;
        }
        return ans;
    }
    public boolean exist(char[][] b, String word) {
        boolean ans = false;
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                if(solve(b, word, i, j, 0)) return true;
            }
        }
        return ans;
    }
}