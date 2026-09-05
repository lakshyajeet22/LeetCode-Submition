class Solution {
    public long maxWeight(int[] p) {
        Arrays.sort(p);
        int n = p.length, days = n / 4, odd = (days + 1) / 2, even = days / 2, r = n - 1;  
        long ans = 0;
        for (int i = 0; i < odd; i++) {
            ans += p[r--];
        }
        for (int i = 0; i < even; i++) {
            r--;              
            ans += p[r--];    
        }
        return ans;
    }
}