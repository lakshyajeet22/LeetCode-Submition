class Solution {
    public int pvs(Stack<Integer> st, int ele,int n, int[] arr, int i){
        while(!st.isEmpty() && arr[st.peek()]>=ele){
            st.pop();
        }
        
        int a = st.isEmpty()? -1 : st.peek();
        st.push(i);
        return a;
    }
    public int nxs(Stack<Integer> st, int ele,int n, int[] arr, int i){
        while(!st.isEmpty() && arr[st.peek()]>=ele){
            st.pop();
        }
       

        int a = st.isEmpty()? n : st.peek();
        st.push(i);
        return a;
    }
    public int largestRectangleArea(int[] arr) {
        int n = arr.length; 
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] nx = new int[arr.length];
        int p[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            nx[i]=nxs(st1, arr[i], n, arr, i);
        }
        for(int i=0; i<arr.length; i++){
            p[i]=pvs(st2, arr[i], n, arr, i);
        }
        int area=0;
        for(int i =0; i<n; i++){
            int s = arr[i]*(nx[i]-p[i]-1);
            area = Math.max(area, s );
        }
        return area;
    }
}