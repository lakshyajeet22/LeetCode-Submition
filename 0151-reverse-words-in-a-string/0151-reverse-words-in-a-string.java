class Solution {
    public static void swap(String[] arr, int i, int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public String reverseWords(String s) {
        String[] arr= s.split("\\s+");
        int i=0, j=arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
        String ans="";
        for(String a : arr){
            ans+=a+" ";
        }return ans.trim();
    }
}