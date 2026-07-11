class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> list = new ArrayList<>();
       for(int i=0; i<nums.length-2; i++){
            int j=i+1,k=nums.length-1;
            if(i!=0 && nums[i-1]==nums[i]) continue;
            while(j<k){
                
                
                int sum=nums[i]+nums[k]+nums[j];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j++]);
                    temp.add(nums[k--]);
                    list.add(temp);
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;

                }
            }
       }return list;
        
        

    }
}