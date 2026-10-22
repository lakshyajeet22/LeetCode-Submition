class Pair{
    int index;
    int val;
    public Pair(int index, int val){
        this.index = index;
        this.val = val;
    }
}
class Solution {

    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek().val<=arr[i]){
                st.pop();
            }
            int s = arr[i];
            arr[i]=st.isEmpty()? 0 : st.peek().index - i;
            st.push(new Pair(i, s));
        }
        return arr;
    }
}