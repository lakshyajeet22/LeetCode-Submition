class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=-1,s=0, n=nums.length, e=n-1;
        while(s<=e){
             int mid=s+(e-s)/2;
            if(nums[mid]==target){ 
                index=mid;
               return mid;
            }  
            else if(nums[mid]>target)e=mid-1;
            else if(nums[mid]<target) s=mid+1;
        }return s;
    }
}