class Solution {
    boolean solve(int[] arr, int h, int rate){
        double hr = 0;
        for(int i : arr){
            hr+=Math.ceil((double)i/(double)rate);
            if((int)hr>h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int s = 1;
        int e=0;
        for(int i : arr){
            e=Math.max(e, i);
        }
        int ans =1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(solve(arr, h, mid)){
                ans = mid;
                e=mid-1;
            }else s=mid+1;
        }
        return ans;
    }
}