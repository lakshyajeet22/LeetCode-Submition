class Solution {
     public void x(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans ){
        if(arr.length==i){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(arr[i]);
        x(arr, i+1, curr, ans);
        while( i+1<arr.length && arr[i]==arr[i+1]) i++;
        curr.remove(curr.size()-1);
        x(arr, i+1, curr, ans);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        x(nums, 0, curr, ans);
        return ans;

    }
}