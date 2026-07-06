class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start=m-1;
        int end=n-1;
        int pos=nums1.length-1;
        while(end>=0){
            if(start==-1){
                nums1[pos]=nums2[end];
                pos--;
                end--;
            }
            else if(nums1[start]<nums2[end]){
                nums1[pos]=nums2[end];
                pos--;
                end--;
            }
            else{
                nums1[pos]=nums1[start];
                pos--;
                start--;
            }
        }
    }
}