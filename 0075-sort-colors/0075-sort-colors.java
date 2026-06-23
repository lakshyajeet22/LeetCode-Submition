class Solution {
    public static void swap(int[] arr, int k, int b){
        int temp=arr[k];
        arr[k]=arr[b];
        arr[b]=temp;

    }
    public void sortColors(int[] nums) {
        int i=0, j=nums.length-1, k=0;
        while(k<=j){
            if(nums[k]==2){
                Solution.swap(nums, k, j);
                j--;
            }
            else if(nums[k]==0){
                Solution.swap(nums, k, i);
                i++;
                k++;
            }
            else{
               k++;
            }
        }
    }
}