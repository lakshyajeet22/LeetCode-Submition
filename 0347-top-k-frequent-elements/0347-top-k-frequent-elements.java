class Pair implements Comparable<Pair>{
    int key;
    int value;
    Pair(int key, int value){
        this.key=key;
        this.value=value;
    }
    public int compareTo(Pair that){
        return this.value-that.value;

    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i : map.keySet()){
            pq.offer(new Pair(i, map.get(i)));
            if(pq.size()>k) pq.poll();
        }

        int[] arr = new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()){
            arr[i++]=pq.poll().key;
        }
        return arr;
        
        

    }
}