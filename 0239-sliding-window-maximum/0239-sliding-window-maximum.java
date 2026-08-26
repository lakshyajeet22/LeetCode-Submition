class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int j=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<nums.length; i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
               dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1) list.add(nums[dq.peekFirst()]);
        }
        int arr[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}