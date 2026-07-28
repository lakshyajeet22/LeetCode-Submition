class Solution {
    public int largestRectangleArea(int[] h) {
        int[] a = new int[h.length];
        int[] c = new int[h.length];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int max=0;
        for(int i=0; i<h.length; i++){
            while(!st1.isEmpty() && h[st1.peek()]>=h[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                a[i]=-1;
                st1.push(i);
                continue;
            }
            a[i]=st1.peek();
            st1.push(i);
        }
        for(int i=h.length-1; i>=0; i--){
            while(!st2.isEmpty() && h[st2.peek()]>=h[i]){
                st2.pop();
            }
            if(st2.isEmpty()){
                c[i]=h.length;
                st2.push(i);
                continue;
            }
            c[i]=st2.peek();
            st2.push(i);
        }
        for(int i=0; i<h.length; i++){
            int area = h[i]*(c[i]-a[i]-1);
            max=Math.max(max, area);
        }

        return max;

    }
}