class Solution {
    void solve(List<List<Integer>> ans,  ArrayList<Integer> cur, boolean isVis[], int i, int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
        }
        for(int j=0; j<nums.length; j++){
            if(!isVis[j]){
                cur.add(nums[j]);
                isVis[j]=true;
                solve(ans, cur, isVis, i+1, nums);
                cur.removeLast();
                isVis[j]=false;

            }
        }   
    }

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean isVis[] = new boolean[nums.length];
        solve(ans, cur, isVis, 0, nums);
        return ans;
    }
}