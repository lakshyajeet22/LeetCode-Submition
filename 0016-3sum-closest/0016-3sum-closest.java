class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0], d=Integer.MAX_VALUE;
        for(int i=0; i<nums.length-1; i++){
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int dif=Math.abs(sum-target);
                if(dif<d){
                    d=dif;
                    ans=sum;
                }
                if(sum == target){
                   return sum;
                }else if(sum > target){
                    k--;
                }else j++;
            }
        }return ans;
    }
}