class Solution {
    public int searchInsert(int[] nums, int t) {
        int i=0;
        for(; i<nums.length; i++){
            if(nums[i]>=t) return i;
        }
        return i;
    }
}