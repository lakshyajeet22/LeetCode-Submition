class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0;
        int l=0;
        HashSet<Character> set = new HashSet<>();

        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                l=Math.max(l, set.size());
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return l;
    }
}