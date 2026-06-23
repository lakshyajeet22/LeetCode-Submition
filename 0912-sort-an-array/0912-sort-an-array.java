class Solution {
     public static void conquer(int[] arr, int s, int mid, int e) {
        int[] merge = new int[e-s+1];
        int i=s, j=mid+1;
        int k=0;
        while(i<=mid && j<=e){
            if (arr[i] < arr[j])
                merge[k++] = arr[i++];
            else
                merge[k++] = arr[j++];
        }
        while(j<=e){ merge[k++]= arr[j++];}
        while(i<=mid) merge[k++]= arr[i++];
        for (int l = 0; l < merge.length; l++) {
            arr[l+s] = merge[l];
        }

    }
    public static void divide(int[] arr, int s, int e){
        if(s>=e) return;
        int mid=s+(e-s)/2;
        divide(arr, s,mid);
        divide(arr,mid+1, e);
        conquer(arr, s, mid, e);
    }
    public int[] sortArray(int[] nums) {
        Solution.divide(nums, 0, nums.length-1);
        return nums;
    }
}