
class Solution {
    public void dfs(int sr, int sc, int oldC, int color, int[][] mat){
        if(sr<0 || sc<0 || sr>=mat.length || sc >= mat[0].length)
            return ;
        
        if(mat[sr][sc]==oldC){
            mat[sr][sc]=color;
            dfs(sr-1, sc, oldC, color, mat);
            dfs(sr, sc-1, oldC, color, mat);
            dfs(sr+1, sc, oldC, color, mat);
            dfs(sr, sc+1, oldC, color, mat);
        }
}
    public int[][] floodFill(int[][] image, int sr, int sc, int color) { 
        int oldC=image[sr][sc];
        if(oldC == color)
            return image;
        dfs(sr, sc, oldC, color, image);
        return image;

    }
}