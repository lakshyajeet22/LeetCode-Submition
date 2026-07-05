class Solution {
    public static void rev(int[] arr, int s, int r){
        while(s<r){
            swap(arr, s, r);
            s++;
            r--;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums, 0, nums.length-1);
        rev(nums,0, k-1);
        rev(nums,k, nums.length-1);
    }
}