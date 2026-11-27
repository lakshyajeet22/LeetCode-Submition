class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        for(int i=0; i<=n; i++){
            boolean isPre=false;
            for(int j=0; j<n; j++){
                if(arr[j]==i){
                    isPre=true;
                    break;
                }
            }   
            if(!isPre) return i;
        }
        return 0;
    }
}