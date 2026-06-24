class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        
        int i=0, n=arr.length;
        while(i<arr.length){
            if(arr[i]==i+1) i++;
            else if(arr[i]==arr[arr[i]-1]) i++;
            else swap(arr, i, arr[i]-1 );
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0; j<n; j++){
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }return list;
    }
}