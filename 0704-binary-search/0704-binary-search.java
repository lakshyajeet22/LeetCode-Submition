class Solution {
    public static int bs(int[] arr, int s, int e, int target){
        int mid= s+(e-s)/2;
        if(s>e) return -1;
        if(arr[mid]==target) return mid;
        if(arr[mid]<target)  return bs(arr, mid+1, e, target);
        else return bs(arr, s, mid-1, target);
    } 
    public int search(int[] arr, int target) {
       return bs(arr, 0, arr.length-1, target);
    }
}