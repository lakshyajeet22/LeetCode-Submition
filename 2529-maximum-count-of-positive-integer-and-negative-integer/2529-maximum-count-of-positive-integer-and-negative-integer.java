class Solution {
    public int maximumCount(int[] arr) {
        int cP = 0, cN=0, s=0;

        for(int i : arr){
            s =  i>0 ? cP++ : i<0 ? cN++ : s++;
        }
        return Math.max(cP, cN);
        
    }
}