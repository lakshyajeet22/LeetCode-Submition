class Solution {
    public int smallestNumber(int n, int t) {
        int p=1;
       
        while(true){
            int temp=n;
            while(temp!=0){
                p*=temp%10;
                temp/=10;
            }
            if(p%t==0) break;
            n=n+1;
            p=1;
        }return n;
    }
}