class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(arr[i]);
                map.put(arr[i], -1);
            }else{
                int temp = st.peek();
                st.push(arr[i]);
                map.put(arr[i], temp);
            }

        }
        for(int i=0; i<nums1.length; i++){
            nums1[i]=map.get(nums1[i]);

        }
        return nums1;
    }
}