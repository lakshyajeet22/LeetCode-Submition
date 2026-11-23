class Solution {
    public int removeDuplicates(int[] nums) {
        int temp[] = new int[nums.length];
        temp[0]=nums[0];
        int k=0;
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i]!=nums[i-1]){
                k++;
                temp[k]=nums[i];
            }
        }
        for(int i=0; i<n; i++){
            nums[i]=temp[i];
        }
        return k+1;
    }
}