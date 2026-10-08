class Solution {
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void func(List<String> ans, char[] arr, int i){
        if(i==arr.length){
            ans.add(new String(arr));
            return;
        }
        for(int j=i; j<arr.length; j++){
            swap(arr, i, j);
            func(ans, arr, i+1);
            swap(arr, i, j);
        }
    }
    public String getPermutation(int n, int k) {
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i]=(char)(49+i);
        }
        List<String> ans = new ArrayList<>();
        func(ans, arr, 0);
        Collections.sort(ans);
        return ans.get(k-1);
    }
}