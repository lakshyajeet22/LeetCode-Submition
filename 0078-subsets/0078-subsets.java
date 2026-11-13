class Solution {
    void solve(List<Integer> cur, List<List<Integer>> list, int i , int[] nums){
        if(i==nums.length){
            list.add(new ArrayList<>(cur));
            return;
        }
        solve(cur, list, i+1, nums);
        cur.add(nums[i]);
        solve(cur, list, i+1, nums);
        cur.removeLast();
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> cur= new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        solve(cur, list, 0, nums);
        return list;
    }
}