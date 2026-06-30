class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[s] <= nums[mid]) {
                min = Math.min(nums[s], min);
                s=mid+1;
            } else {
                if(nums[mid]==nums[s]) {
                    s=mid+1;
                    min = Math.min(nums[mid], min);
                }else{ e=mid-1;
                    min = Math.min(nums[mid], min);
                }
            }
        }return min;
    }
}