class Solution {
    
    public static void l(List<Integer> list, int n, int k, int i){
        
        
        if(list.size()==1) return ;
       
        i=(i+k)%list.size();
        list.remove(i);
        l(list,list.size(), k, i);
        
        
    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(i+1);
        }
       l(list, n, k-1,0);
     return list.get(0);

        
    }
}