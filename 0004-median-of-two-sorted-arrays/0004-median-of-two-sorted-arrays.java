class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        
        // if(nums1.length>nums2.length){
        //     int[] temp= nums1;
        //     nums1=nums2;
        //     nums2=temp;
        // }
        int m=nums1.length, n=nums2.length;
        int s=0, e=m;
        if(nums1.length>nums2.length)  return findMedianSortedArrays(nums2, nums1);

        while(s<=e){
            int mid1 = s+(e-s)/2;
            int mid2 = (m+n+1)/2 - mid1;

            int l1=mid1==0?Integer.MIN_VALUE: nums1[mid1-1];
            int l2=mid2==0? Integer.MIN_VALUE: nums2[mid2-1];

            int r1= mid1==m?Integer.MAX_VALUE: nums1[mid1];
            int r2=mid2==n? Integer.MAX_VALUE: nums2[mid2];

            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                }else return Math.max(l1,l2);
            }if(l1>r2){
                e=mid1-1;
            }else s=mid1+1;

            
        }return 0.0;
    }
}