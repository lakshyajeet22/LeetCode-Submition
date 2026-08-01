class Solution {
    public void x(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans ){
        if(arr.length==i){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        x(arr, i+1, curr, ans);
        curr.remove(curr.size()-1);
        x(arr, i+1, curr, ans);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        x(nums, 0, curr, ans);
        return ans;

        
        
    }
}