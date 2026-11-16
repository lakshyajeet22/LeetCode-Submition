class Solution {
    void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr, i++, j--);
        }
    }
    public void nextPermutation(int[] nums) {
        int i;
       for(i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                break;
            }    
       }
       if(i>=0 && nums[i]<nums[i+1]){
            for(int j=nums.length-1; j>=0; j--){
                if(nums[j]>nums[i]){
                    swap(nums, i, j);
                    break;
                }
            }
        }
        reverse(nums , i+1, nums.length-1);
    }
}