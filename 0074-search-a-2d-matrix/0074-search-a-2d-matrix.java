class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s =0, e = matrix.length*matrix[0].length -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target == matrix[mid/matrix[0].length][mid%matrix[0].length]) return true;
            else if(target < matrix[mid/matrix[0].length][mid%matrix[0].length]) e= mid-1;
            else s= mid+1;
        }return false;
    }
}