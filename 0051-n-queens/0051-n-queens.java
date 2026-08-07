class Solution {
    public boolean isValid(int[][] arr, int i, int j){
        int row = i-1, col = j;
        while(row>=0){
            if(arr[row][col]  == 1) return false;
            row--;
        }
        row = i-1;
        col = j-1;
        while(row>=0 && col>=0){
            if(arr[row][col]==1) return false;
            row--;
            col--;
        }
        row = i-1;
        col=j+1;
        while(row>=0 && col<arr.length){
            if(arr[row][col]==1) return false;
            row--;
            col++;

        }
        return true;
    }
    
    public void solve(List<List<String>> ans,int[][] arr, int n, int i ){
        if(i==arr.length){
            List<String> curr = new ArrayList<>();
            ret( arr,ans, curr);
            return;
        }
       for(int j=0; j<arr.length; j++ ){
         if(isValid(arr, i, j)){
            arr[i][j]=1;
            
            solve(ans, arr, n, i+1);
            arr[i][j]=0;
        }
       }
        return;

    }
    public void ret(int[][] arr, List<List<String>> ans, List<String> curr) {
        for(int i=0; i<arr.length; i++){
            String temp = "";
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==0) temp=temp+".";
                else temp = temp + "Q";
            }
            curr.add(temp);
        }
        ans.add(new ArrayList<>(curr));
    }
    public List<List<String>> solveNQueens(int n) {
        int[][] arr = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        solve(ans, arr, n, 0);
        return ans;
        
    }
}