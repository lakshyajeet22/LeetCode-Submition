class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=arr[0];
        int maxI=-1;
        for(int i=0; i<arr.length; i++){
            max=Math.max(arr[i], max);
            maxI=i;
        }
        int i=0, j=arr.length-1; 
        while(i<arr.length-1 && arr[i]<arr[i+1]  ){
            i++;
        }
        while( j>0 && arr[j]<arr[j-1] ){
            j--;
        }
        if(i==0 || i==arr.length-1) return false;
        return i==j ;
    }
}