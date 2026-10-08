class Solution {
    boolean solve(int[] arr, long k, int cap){
        long curCap =0;
        for(int i : arr){
            curCap+=i/cap;
        }
        return curCap>=k;

    }
    public int maximumCandies(int[] arr, long k) {
        int s=1;
        int e=arr[0];
        for(int i : arr){
            if(i>e){
                e=i;
            }
        }
        int ans =0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(solve(arr, k, mid)){
                ans = mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}