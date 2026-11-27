class Solution {
    public int removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int i=1, j=1;
        temp[0]=arr[0];
        while(i<arr.length){
            if( arr[i]!=arr[i-1]){
                    temp[j++]=arr[i];
                
            }
            i++;
        }
        for(int k=0; k<temp.length; k++){
            arr[k]=temp[k];
        }
        return j;
    }
}