class Solution {
    void solve(List<List<Integer>> ans, List<Integer> curr, int i, int k,  int t , int n, int[] arr){
        if(t==0 && curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==n) return;
        if(t>=arr[i]){
            curr.add(arr[i]);
            solve(ans, curr, i+1, k, t-arr[i], n, arr);
            curr.removeLast();
        }
        solve(ans, curr, i+1, k, t, n, arr);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = new int[9];
        for(int i=0; i<9;i++){
            arr[i]=i+1;
        }
        int len = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(ans, curr, 0, k, n, len, arr );
        return ans;
    }
}