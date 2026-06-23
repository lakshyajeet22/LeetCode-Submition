class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            int k=0, m=image[0].length-1;
            while(k<m){
                int temp=image[i][k];
                image[i][k]=image[i][m];
                image[i][m]=temp;
                k++;
                m--;
            }
            for(int j=0; j<image[0].length; j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else if(image[i][j]==1){
                    image[i][j]=0;
                }
            }
        } return image;
    }
}