class Solution {
    public void solve(List<List<Integer>> ans, int i, List<Integer> curr, int[] arr){
        if(i==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        solve(ans, i+1, curr, arr);
        curr.removeLast();
        solve(ans, i+1, curr, arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(ans, 0, curr, nums);
        return ans;
    }
}