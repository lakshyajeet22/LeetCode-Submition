class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1; i>=0; i--){
            int c=0;
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
                c++;
            }
            if(st.isEmpty()){
                ans[i] = 0;
                st.push(i);
                continue;
            }
            else if(nums[st.peek()]>nums[i]){
                ans[i] = st.peek() - i;
                st.push(i);
            }
        }return ans;
    }
}