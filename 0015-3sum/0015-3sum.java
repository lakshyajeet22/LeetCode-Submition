class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums);

Set<List<Integer>> ans = new HashSet<>();

for (int i = 0; i < nums.length - 2; i++) {

    HashSet<Integer> seen = new HashSet<>();

    for (int j = i + 1; j < nums.length; j++) {

        int need = -nums[i] - nums[j];

        if (seen.contains(need)) {

            ans.add(Arrays.asList(nums[i], need, nums[j]));
        }

        seen.add(nums[j]);
    }
}

        return new ArrayList<>(ans);
        
        

    }
}