class Solution {
    public void solve(Map<Character, String> map, String digits, int i, String curr, List<String> ans ){
        if(i==digits.length()){
            ans.add(curr);
            return;
        }
        String temp = map.get(digits.charAt(i));
        for(int j=0; j<temp.length(); j++){
            solve(map, digits, i+1, curr+temp.charAt(j), ans);
        }

    }
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('6', "mno");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        String curr = "";
        solve(map, digits, 0, curr, ans );
        return ans;




        
    }
}