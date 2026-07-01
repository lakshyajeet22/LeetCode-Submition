class Solution {
    public static boolean isValid(int[] arr, int cap, int days){
        int cD=1, cW=0; 
        for(int i : arr){
            if(cW+i>cap){
                cD++;
                cW=i;
                if(cD>days) return false;
            }else cW+=i;
        }return true;
    }
    public int shipWithinDays(int[] arr, int days) {
        int s=0, e=0, ans=0;
        for(int i: arr){
            s=Math.max(s, i);
            e+=i;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(arr, mid, days)){
                ans=mid;
                e=mid-1;
            }else s=mid+1;
        }return ans;
    }
}