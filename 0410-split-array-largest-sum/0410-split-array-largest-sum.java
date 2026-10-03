class Solution {
    boolean isVal(int[] arr, long cap, int st){
        long currCap =0;
        int cSt=1;
        for(int i : arr){
            if(currCap+i > cap){
                currCap=i;
                cSt++;
                if(cSt>st) return false;
            }else currCap+=i;
        }
        return true;
    }
    public int splitArray(int[] arr, int k) {
        if(arr.length<k) return -1;
        long s = arr[0];
        long e = 0;
        long ans =-1;
        for(int i : arr){
            s=Math.max(s, i);
            e+=i;
        }
        while(s<=e){
            long mid = s+(e-s)/2;
            if(isVal(arr, mid, k)){
                ans = mid;
                e=mid-1;
            }else s=mid+1;
        }
        return (int)ans;
    }
}