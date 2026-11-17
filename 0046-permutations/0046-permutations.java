class Solution {
    void solve(List<List<Integer>> ans, List<Integer> temp, boolean[] isVal, int i, int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=0; j<nums.length; j++){
            if(!isVal[j]){
                isVal[j]=true;
                temp.add(nums[j]);
                solve(ans, temp, isVal, i+1, nums);
                temp.removeLast();
                isVal[j]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        boolean isVal[] = new boolean[nums.length];
        solve(ans, temp, isVal, 0, nums);
        return ans;

    }
}