class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        for(int i=nums[0]; i<=nums[nums.length-1]; i++){
            if(!list.contains(i)){
                ans.add(i);
            }
        }return ans;
    }
}