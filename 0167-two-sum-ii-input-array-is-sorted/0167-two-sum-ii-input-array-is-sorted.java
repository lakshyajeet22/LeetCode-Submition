class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<e){
            long sum=(long) nums[s]+nums[e];
            if (sum == target) return new int[]{s+1, e+1};
            else if(sum>target) e--;
            else s++;
        }
        return new int[]{};
    }
}