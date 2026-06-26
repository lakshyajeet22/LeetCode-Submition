class Solution {
    public static int p(int[] arr, int s, int e, int target){
        if(s>e) return s;
        int mid=s+(e-s)/2;
        if(target==arr[mid]) return mid;
        else if(arr[mid]>target) return p(arr, s, mid-1, target);
        else return p(arr, mid+1, e, target);
    }
    public int searchInsert(int[] arr, int target) {
       return p(arr, 0, arr.length-1, target);
    }
}