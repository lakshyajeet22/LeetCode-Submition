class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0, e = nums.length - 1, ans=nums[0];
        if(nums.length == 1) return nums[0];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ((mid % 2) != 0) {
                if(mid==0) ans=nums[mid];
                if ( mid!=0 && nums[mid - 1] != nums[mid] ) {
                    e=mid;
                    ans=nums[mid];
                }else
                    s=mid+1;
            } else {
                if(mid==nums.length-1) ans=nums[mid];
                if(mid!= nums.length-1 && nums[mid]!=nums[mid+1] ){
                    e--;
                    ans=nums[mid];
                }else s++;
            }
        }return ans;
    }
}