class Solution {
    public boolean solve(char[][] arr, String w, int i, int j, int k){
        if(k==w.length()) return true;
        if(i<0 || j<0 || j>=arr[0].length || i>=arr.length){
            return false;

        }
        boolean t=false;
        if(arr[i][j]==w.charAt(k)){
            char s = arr[i][j];
            arr[i][j]='.';
            t=solve(arr, w, i+1, j, k+1) || solve(arr, w, i-1, j, k+1) || solve(arr, w, i, j-1, k+1) || solve(arr, w, i, j+1, k+1);
            arr[i][j] = s;

        }
        return t;

    }
    public boolean exist(char[][] arr, String word) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
               if(solve(arr, word, i, j, 0)) return true;
            }
        }return false;
    }
}