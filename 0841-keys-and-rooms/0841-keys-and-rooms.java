class Solution {
    public void solve(List<List<Integer>> r,  boolean[] arr, int a){
        arr[a]=true;
        for(int i : r.get(a)){
            if(!arr[i]) solve(r, arr, i);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> r) {
        boolean[] arr = new boolean[r.size()];
        solve(r, arr, 0);
        for(boolean i : arr){
            if(!i) return i;
        }
        return true;
    }
}