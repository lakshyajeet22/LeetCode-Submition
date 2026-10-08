class Solution {

    public boolean isSub(String s, String p, int[] arr, int k) {

        boolean[] removed = new boolean[s.length()];

        // Remove first k characters
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

    public int maximumRemovals(String s, String p, int[] arr) {

        int low = 0;
        int high = arr.length;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isSub(s, p, arr, mid)) {
                ans = mid;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}