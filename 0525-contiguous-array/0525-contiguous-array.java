class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            
        }
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0, l=0, maxL=0;
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
               
                l=i-map.get(sum);
                maxL=Math.max(l, maxL);
            }
        }return maxL;
    }
}