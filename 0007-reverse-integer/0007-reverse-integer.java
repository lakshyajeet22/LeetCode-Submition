class Solution {
    public int reverse(int x) {
       int a=0;
       int fn=x;
      

        while(x!=0){
            int temp=x%10;
            if(a > Integer.MAX_VALUE/10 || (a == Integer.MAX_VALUE/10 && temp>7))
                return 0;
            if( a < Integer.MIN_VALUE/10 || (a == Integer.MIN_VALUE/10 && temp<-8) ) 
                return 0;
            
            a=(a*10)+temp;
            x=x/10;

        }return a;
    }
}