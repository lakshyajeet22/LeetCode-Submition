
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int k = (i + 1) % nums.length;
            int max = -1;

            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[k] > nums[i]) {
                    max = nums[k];
                    break;
                }

                k = (k + 1) % nums.length;
            }

            ans[i] = max;
        }

        return ans;
    }
}
