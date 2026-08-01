class Solution {
     public void x(int[] arr, int i, List<Integer> curr, Set<List<Integer>> ans ){
        if(arr.length==i){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        x(arr, i+1, curr, ans);
        curr.remove(curr.size()-1);
        x(arr, i+1, curr, ans);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Set<List<Integer>> ans = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        x(nums, 0, curr, ans);
        return new ArrayList<>(ans);

    }
}