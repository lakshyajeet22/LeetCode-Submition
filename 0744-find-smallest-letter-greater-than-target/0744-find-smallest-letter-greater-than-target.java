class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=' ';
        int s=0, e=letters.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            
            if((int)letters[m]>(int)target){
                e=m-1;
                ans=letters[m];
            }
            else s=m+1;
        }
        return ans==' '? letters[0]: ans;
    }
}