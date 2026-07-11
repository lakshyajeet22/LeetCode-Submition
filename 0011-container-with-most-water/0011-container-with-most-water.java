class Solution {
    public int maxArea(int[] h) {
        int i=0, j=h.length-1, maxA=0;
        while(i<j){
            int l=j-i;
            int ht=Math.min(h[i],h[j]);
            int Ar=l*ht;
            maxA=Math.max(Ar, maxA);
            if(h[i]>h[j]) j--;
            else i++;
        } return maxA;
    }
}