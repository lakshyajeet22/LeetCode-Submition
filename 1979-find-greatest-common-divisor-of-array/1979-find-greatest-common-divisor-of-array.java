class Solution {
    public int findGCD(int[] nums) {
        Set<Integer> s= new HashSet<>();
        for(int i: nums){
            s.add(i);
        }
        int max=Collections.max(s);
        int min=Collections.min(s);
        
    
    while (min != 0) {
        int temp = min;
        min = max % min;
        max = temp;
    }
    int gcd= Math.abs(max);
    return gcd;
}   
    
}