class Solution {
    public boolean isPerfectSquare(int n) {
        for(int i=1; i<=n/i; i++) if(i*i==n) return true;
        return false;
    }
}