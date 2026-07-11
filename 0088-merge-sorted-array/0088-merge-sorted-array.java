class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m+n-1; i>=m; i--){
            nums1[i]=nums2[k++];
        }
        Arrays.sort(nums1);
    }
}