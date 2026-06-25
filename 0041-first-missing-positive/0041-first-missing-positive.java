class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int firstMissingPositive(int[] arr) {
        int i=0, n=arr.length; 
        while(i<n){
            if( arr[i]<=n && arr[i]>=1 && arr[i]==arr[arr[i]-1] ) i++;
           else if(arr[i]<=n && arr[i]>=1 && arr[i]!=i+1 ) swap(arr, i, arr[i]-1);
           else i++;
        }
        for(int j=0; j<n; j++){
            if(arr[j]!=j+1) return j+1;
        }return n+1;
    }
}