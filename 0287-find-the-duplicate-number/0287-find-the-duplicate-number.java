class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int findDuplicate(int[] arr) {
        int i=0, n=arr.length;
        while(i<n){
            if(arr[i]==i+1) i++;
            else if(arr[i]==arr[arr[i]-1]) 
                return arr[i];
            else swap(arr, i, arr[i]-1 );
        }
        return 0;
    }
}