class Solution {
    void solve(List<String > ans, String temp, int i, int n, String s , boolean[] isVal){
        if(i==s.length()){
            ans.add(temp);
            return;
        }
        for(int j=0; j<s.length(); j++){
            if(!isVal[j]){
                isVal[j]=true;
                solve(ans, temp+s.charAt(j), i+1, n, s, isVal);
                isVal[j]=false;
            }
        }
    }
    public String getPermutation(int n, int k) {
        String s = "";
        for(int i=1; i<=n; i++){
            s+=i;
        }
        boolean[] isVal= new boolean[n];
        List<String > ans = new ArrayList<>();
        String temp ="";
        solve(ans, temp,0, n, s, isVal);
        return ans.get(k-1);
    }
}