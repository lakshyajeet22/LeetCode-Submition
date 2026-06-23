class Solution {
    public int trap(int[] height) {
        int n=height.length, sum=0;
        int[] lm=new int[n];
        int[] rm=new int[n];
        for(int i=1; i<n; i++){
            lm[0]=height[0];
            lm[i]=Math.max(lm[i-1], height[i]);

            
        }
        for(int i=n-2; i>=0; i--){
            rm[n-1]=height[n-1];
            rm[i]=Math.max(rm[i+1], height[i]);
            
            
        }
        for(int i=1; i<n-1; i++){
            int ans = Math.min(lm[i], rm[i])-height[i];
            if(ans>0){
                sum+=ans;
            }else{
                continue;
            }
        }return sum;
    }
}