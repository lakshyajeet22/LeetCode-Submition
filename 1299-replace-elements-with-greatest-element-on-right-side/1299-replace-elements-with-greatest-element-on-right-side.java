class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int i=arr.length-1;
        while(i>=0){
            int curr = arr[i];
            arr[i]=max;
            max=Math.max(max, curr);
            i--;
        }return arr;
    }
}