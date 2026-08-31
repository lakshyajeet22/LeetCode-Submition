class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int a : stones){
            pq.offer(a);
        }
        while(pq.size()>1){
            int f = pq.poll();
            int s = pq.poll();
            if(f==s) continue;
            pq.offer(f-s);

        }
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}