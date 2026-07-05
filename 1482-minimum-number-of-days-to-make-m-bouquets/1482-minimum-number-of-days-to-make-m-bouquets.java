class Solution {
    public static boolean Valid(int[] arr, int mid, int k, int m){
        int c=0, b=0;
        for(int i : arr){
            if(i<=mid){
                c++;
                if(c==k){ b+=1; c=0;}
            }else c=0;
        }if(m<=b) return true;
        return false;
        
    }
    public int minDays(int[] arr, int m, int k) {
        if((long)m*k > arr.length) return -1;
        int s=0, e=Integer.MIN_VALUE, ans=0;
        for(int i : arr){
            s=0;
            e=Math.max(e, i);
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(Valid(arr, mid, k, m)){
                e=mid-1;
                ans=mid;
            }else s=mid+1;
        }return ans ;
    }
}