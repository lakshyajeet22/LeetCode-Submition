class Solution {
    public int majorityElement(int[] nums) {
        int winner=nums[0], vote=1;
        for(int i : nums){
            if(i==winner){
                vote++;
            }else vote--;
            if(vote==0){
                winner=i;
                vote=1;
            }
        }return winner;
    }
}