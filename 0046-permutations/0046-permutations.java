class Solution {
    public void swap(Integer[] arr, int i, int j){
        Integer temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void solve(Integer[] arr, List<List<Integer>> ans, int i ){
        if(i==arr.length-1){
            ans.add(new ArrayList<>(Arrays.asList(arr)));
            return;
        }
        for(int j=i; j<arr.length; j++){
            swap(arr, i, j);
            solve(arr, ans, i+1);
            swap(arr, i, j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Integer[] arr = new Integer[nums.length];

        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i];
        }
        solve(arr, ans, 0);
        return ans;
    }
}