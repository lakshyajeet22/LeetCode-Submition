class Pair implements Comparable<Pair>{
    String key;
    int value;
    Pair(String key, int value){
        this.key=key;
        this.value=value;
    }
    public int compareTo(Pair that){
        if (this.value != that.value) {
        return this.value - that.value;
    }
        return that.key.compareTo(this.key);
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String i : words){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(String i : map.keySet()){
            pq.offer(new Pair(i, map.get(i)));
            if(pq.size()>k) pq.poll();
        }

        List<String> list = new ArrayList<>();
        int i=0;
        while(!pq.isEmpty()){
            list.add(pq.poll().key);
        }
        Collections.sort(list, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a.compareTo(b);
        });
        return list;
    }
}