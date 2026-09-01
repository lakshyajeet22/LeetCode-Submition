class Pair {
    int x, y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
    int getDis(){
        return (x*x)+(y*y);
    }
    

}
class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.getDis() - a.getDis());
        for(int[] arr : points){
            pq.offer(new Pair(arr[0], arr[1]));
            if(pq.size()>k) pq.poll();
            }
        
        int[][] ans = new int[pq.size()][2];
        int i=0;
        while(!pq.isEmpty()){
            Pair obj = pq.poll();
            ans[i][0]=obj.x;
            ans[i][1]=obj.y;
            i++;
        }
        return ans;
    }
}