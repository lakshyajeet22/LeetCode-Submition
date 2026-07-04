class Solution {
    public int longestPalindrome(String s) {
        int c=0;
        boolean a=false;
        Map<Character, Integer> map =  new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch: map.keySet()){
          if(map.get(ch)%2==0){
            c+=map.get(ch);
          }else {
            c+=map.get(ch)-1;
            a=true;
          }

        }
        
        return  a ? c+1:c;
        
    }
}