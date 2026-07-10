class Solution {
    public static void swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sortArrayByParityII(int[] nums) {
        int i=0, k=1;
        while(i<nums.length && k<nums.length){
            while(i<nums.length && nums[i] %2==0) i+=2;
            while(k<nums.length && nums[k] %2!=0) k+=2;

            if(i<nums.length && k<nums.length){
                swap(nums, i, k);
            }
        }return nums;
    }
}