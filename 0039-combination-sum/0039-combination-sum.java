class Solution {
    public void solve(List<Integer> curr, List<List<Integer>> ans,int[] arr, int target, int i ){
        if(target == 0 ){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==arr.length) return;
       if( arr[i]<=target){
            curr.add(arr[i]);
            
            solve(curr, ans, arr, target-arr[i], i);
            
            curr.removeLast();
       }
            solve(curr, ans, arr, target, i+1);


    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(curr,ans, arr, target, 0 );
        return ans;
    }
}