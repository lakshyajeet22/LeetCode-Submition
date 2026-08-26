class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0, j=0, curr=0, max=0;

        while(j<arr.length){
            map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            j++;
            while(map.size()>2){
                map.put(arr[i], map.getOrDefault(arr[i], 0)-1);
                if(map.get(arr[i])==0) map.remove(arr[i]);
                i++;
            }
            curr=j-i;
            max=Math.max(curr, max);
        }
        return max;
    }
}