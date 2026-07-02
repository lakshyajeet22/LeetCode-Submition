class Solution {
    public static boolean isValid(int [] arr, int h, int mid){
       int sum=0;
       for(int i: arr){
            sum+=Math.ceil((double)i/mid);  
       }return sum<=h;
    }
    public int smallestDivisor(int[] nums, int h) {
        
        int s=1, e=0, ans=-1;
        for(int i: nums){
            e=Math.max(e, i);
           
        }
        while(s<=e){
            
            int mid=s+(e-s)/2;
            if(isValid(nums, h, mid)){
                e=mid-1;
                ans=mid;
            }else s=mid+1;
        }return ans ;

    }
}