class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0, sum=0;
        int[] rsum=new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
        
            sum+=nums[i];
            rsum[i]=sum;
        }
        for(int i=0; i<nums.length; i++){
            lsum+=nums[i];
            if(lsum==rsum[i]){
                return i;
            }
        }return -1;
    }
}