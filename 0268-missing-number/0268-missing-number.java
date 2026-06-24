class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int missingNumber(int[] arr) {
        int i=0, n=arr.length;
        while(i<n){
            int cI=arr[i];
            if(arr[i]<n && arr[i]!=arr[cI]){
                swap(arr, i, cI);
            }else i++;
        }
        for(int j=0; j<n; j++){
            if(arr[j]!=j) return j;
        }
        return n;
    }
}