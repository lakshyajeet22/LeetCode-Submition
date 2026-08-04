class Solution {
    List<String> list;
    Map<Integer, char[]> map;
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        list = new ArrayList<>();
        map = new HashMap<>();
        map.put(2, new char[]{'a', 'b', 'c'});
        map.put(3, new char[]{'d', 'e', 'f'});
        map.put(4, new char[]{'g', 'h', 'i'});
        map.put(5, new char[]{'j', 'k', 'l'});
        map.put(6, new char[]{'m', 'n', 'o'});
        map.put(7, new char[]{'p', 'q', 'r', 's'});
        map.put(8, new char[]{'t', 'u', 'v'});
        map.put(9, new char[]{'w', 'x', 'y', 'z'});

        process(0, new StringBuilder(), digits);
        return list;
    }

    private void process(int index, StringBuilder sb, String digits){
        if (index == digits.length()){
            list.add(sb.toString());
            return;
        }
        for (char c : map.get((digits.charAt(index) - '0'))){
            sb.append(c);
            process(index + 1, sb, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}