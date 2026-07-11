class Solution {
    public void duplicateZeros(int[] arr) {
       for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0){
                int a=arr.length-1;
                while(a>i){
                    arr[a]=arr[a-1];
                    a--;
                }
                
                arr[i+1]=0;
                i++;
            }
       }
    }
}
        