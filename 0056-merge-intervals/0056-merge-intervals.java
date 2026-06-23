class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)-> Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            if(list.get(list.size()-1)[1]>=intervals[i][0]){
                list.get(list.size()-1)[1]=Math.max(intervals[i][1],list.get(list.size()-1)[1]);

            }
            else{
                list.add(intervals[i]);
            }
        }
        int[][] ans=new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }return ans;
    }
}