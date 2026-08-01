class Solution {
    public void solve(List<List<Integer>> ans,List<Integer> curr, int[] nums,boolean[] saw){

        if(curr.size() == nums.length ){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!saw[i]){
                curr.add(nums[i]);
                saw[i]=true;
                solve(ans, curr, nums, saw);
            curr.removeLast();
            saw[i]=false;
            }
            
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] saw = new boolean[nums.length];
        solve(ans, curr, nums, saw);
        return ans;

    }
}