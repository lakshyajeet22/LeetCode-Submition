class Solution {

    public boolean isSub(String s, String p, int[] arr, int k) {
        boolean[] removed = new boolean[s.length()]; 
        for (int i = 0; i < k; i++) {
            removed[arr[i]] = true;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (removed[i]) {
                continue;
            }
            if (j < p.length() && s.charAt(i) == p.charAt(j)) {
                j++;
            }
        }
        return j == p.length();
    }
    public int maximumRemovals(String s1, String p, int[] arr) {
        int s = 0;
        int e = arr.length;
        int ans = 0;
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isSub(s1, p, arr, mid)) {
                ans = mid;
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
}