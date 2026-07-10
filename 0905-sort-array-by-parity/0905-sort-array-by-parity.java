class Solution {
    public static void swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1, k=0;
        while(i<nums.length && k<nums.length){
            if(nums[k]%2==0){
                swap(nums, i, k);
                i++;
                k++;
            }
            else k++;


        }return nums;
    }
}