class Solution {
    public int compareVersion(String s, String t) {
        String[] arr1 = s.split("\\.");
        String[] arr2 = t.split("\\.");
        int ans = 0;
        int n = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < n; i++) {
            int v1 = (i < arr1.length) ? Integer.parseInt(arr1[i]) : 0;
            int v2 = (i < arr2.length) ? Integer.parseInt(arr2[i]) : 0;

            if (v1 > v2) return 1;
            if (v1 < v2) return -1;
        }
        return 0;

    }
}