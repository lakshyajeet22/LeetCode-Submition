class Solution {
    public int heightChecker(int[] source) {
    int[] temp = Arrays.copyOf(source, source.length);
       Arrays.sort(temp);
       int c=0;
       for(int i=0; i<temp.length; i++){
            if(temp[i]!=source[i]) c++;
       }
       return c;

    }
}