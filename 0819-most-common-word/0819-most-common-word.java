
        class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> ban = new HashSet<>();

        for (String word : banned) {
            ban.add(word);
        }

        HashMap<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.replaceAll("[^a-z]", " ").split("\\s+");

        String ans = "";
        int max = 0;

        for (String word : words) {

            if (word.length() == 0 || ban.contains(word))
                continue;

            map.put(word, map.getOrDefault(word, 0) + 1);

            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }

        return ans;
    }
}
    