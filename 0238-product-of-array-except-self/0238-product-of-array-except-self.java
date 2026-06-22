class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l= new int[nums.length];
        int[] ans = new int[nums.length];
        for(int i=1; i<nums.length; i++){
            l[0]=nums[0];
            l[i]=nums[i]*l[i-1];
        }
        int[] r= new int[nums.length];
        for(int i=nums.length-2; i>=0; i--){
            r[nums.length-1]=nums[nums.length-1];
            r[i]=nums[i]*r[i+1];
        }
        for(int i=0; i<nums.length; i++){
           if(i<1) ans[i]=r[i+1];
           else if(i>nums.length-2) ans[i]=l[i-1];
           else ans[i]=l[i-1]*r[i+1];
        }
        return ans;

    }
}