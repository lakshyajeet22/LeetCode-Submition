class Solution {
    public int maxScore(int[] arr, int k) {
        int ls=0, rs=0, max=0;
        for(int i=0; i<k; i++){
            ls+=arr[i];
        }
        max=ls;
        int j=arr.length-1;
        int p=k-1;
        for(int i=0; i<k; i++){
            ls-=arr[p--];
            rs+=arr[j--];
            max=Math.max(max, (ls+rs));
        }
        return max;
    }
}