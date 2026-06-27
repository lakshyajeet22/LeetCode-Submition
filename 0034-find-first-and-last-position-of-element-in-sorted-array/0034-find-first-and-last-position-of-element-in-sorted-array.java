class Solution {
    public static int FI(int[] arr, int s, int e, int target){
        int ans=-1;
        while(e>=s){
            int m=s+(e-s)/2;
            if(arr[m]==target){ 
                ans = m;
                e=m-1;
            }
            else if(arr[m]>target) e=m-1;
            else s=m+1;
        }return ans;
    }
    public static int LI(int[] arr, int s, int e, int target){
        int ans=-1;
        while(e>=s){
           int m=s+(e-s)/2;
            if(arr[m]==target){ 
                ans = m;
                s=m+1;
            }
            else if(arr[m]>target) e=m-1;
            else s=m+1;
        }
        return ans;
    }
    public int[] searchRange(int[] arr, int target) {
        return new int[]{FI(arr, 0, arr.length-1, target),LI(arr, 0, arr.length-1, target)};
    }
}