class Solution {
    public boolean canJump(int[] nums) {
        int f=nums.length-1;
        int n=nums.length;
        for(int i=n-2; i>=0; i--){
            if(i+nums[i]>=f){
                f=i;
            }
        }
        return f==0;
    }
}