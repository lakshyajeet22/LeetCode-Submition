class Solution {
    public static void swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int i=0, j=i+1;
        while(i<nums.length-1 && j<nums.length){
            if(nums[i]!=0){ 
                i++;
                j++;
            }else if(nums[i]==0 && nums[j]!=0){
                swap(nums, i, j);
                i++;
            }else j++;
    }
}
}