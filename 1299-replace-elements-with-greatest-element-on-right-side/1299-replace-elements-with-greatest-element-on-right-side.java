class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int g = arr[i+1];
            for(int j=i+2; j<n; j++){
                g=Math.max(g, arr[j]);
            }
            arr[i]=g;
        }
        arr[n-1]=-1;
        return arr;
    }
}