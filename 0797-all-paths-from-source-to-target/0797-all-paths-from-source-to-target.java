class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(List<List<Integer>> adj,
     ArrayList<Integer> curr, int a){
        curr.add(a);
        if(a==adj.size()-1){
            ans.add(new ArrayList<>(curr));
            curr.removeLast();
            return;

        }
        for(int i : adj.get(a)){
            solve(adj,  curr, i);    
        }
        curr.removeLast();
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
         for(int[] i : graph) {
            ArrayList<Integer> list = new ArrayList<>();

            for(int x : i) {
                list.add(x);
            }

            adj.add(list);
        }
        boolean[] arr = new boolean[adj.size()];
        ArrayList<Integer> curr = new ArrayList<>();
        solve(adj,  curr, 0);
        return ans;
    }
}