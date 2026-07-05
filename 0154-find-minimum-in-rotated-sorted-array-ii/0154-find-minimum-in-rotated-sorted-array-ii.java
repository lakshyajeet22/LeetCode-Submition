class Solution {
    public int findMin(int[] nums) {
        int s=0, e=nums.length-1, ans=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]){
                s=mid+1;
                ans=Math.min(ans, nums[mid]);
            }else if(nums[mid]<nums[e]){
                e=mid-1;
                ans=Math.min(ans, nums[mid]);
            }else{
                ans=Math.min(ans, nums[mid]);
                e--;
            }

        }return ans;
    }
}