class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        for(int i=0; i<=n; i++){
            boolean flag = false;
            for(int j=0; j<n;j++){
                if(arr[j]==i){
                    flag=true;
                    break;
                }
            }
            if(!flag) return i;
        }
        return 0;
    }
}