class Solution {
    void solve(List<List<Integer>> ans, List<Integer> curr, int i, int[] arr, int t , int n){
        if(i==n){
            if(t==0){
                ans.add(new ArrayList<>(curr));
                return;
            }
            return;
        }
        if(t>=arr[i]){
            curr.add(arr[i]);
            solve(ans, curr, i+1, arr, t-arr[i], n);
            curr.removeLast();
        }
        int j =i+1;
        while(j<n && arr[j]==arr[j-1]) j++;
        solve(ans, curr, j, arr, t, n);
    }
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(arr);
        solve(ans, curr, 0, arr, t, n);
        return ans;
    }
}