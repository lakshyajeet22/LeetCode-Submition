class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            TreeMap<Character, Integer> freq = new TreeMap<>();

            for (char ch : s.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            String key = freq.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}