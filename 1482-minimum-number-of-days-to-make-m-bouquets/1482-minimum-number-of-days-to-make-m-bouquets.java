class Solution {
    boolean solve(int[] arr, int cap, int m, int k){
        int curK=0, c=0;
        for(int i : arr){
            if(i<=cap){
                curK++;
                if(curK==k){
                    curK=0;
                    c++;
                }
            }else curK=0;
        }
        return c>=m;
    }
    public int minDays(int[] arr, int m, int k) {
        int s =0, e=0;
        for(int i : arr){
            e=Math.max(e, i);

        }
        int ans =-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(solve(arr, mid, m, k)){
                ans = mid;
                e=mid-1;
            }else s=mid+1;
        }return ans;
    }
}