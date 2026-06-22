class Solution {
    public int maxArea(int[] height) {
        int i=0, n=height.length, j=n-1, maxA=0;
        while(i<j){
            int l=j-i;
            int h=Math.min(height[i], height[j]);
            int area=l*h;
            maxA=Math.max(area, maxA);
            if(height[i]<height[j]){
                i++;
            }else j--;
        }return maxA;
    }
}