package com.robertocannella;

public class MergeSortedArray {
    public static void merge(int[] nums1,int m, int[] nums2, int n){

        int last = m+n -1;
        int k = m -1; // <-- nums1 pointer
        int j = n -1; // <-- nums2 pointer

        for (int i = last; i >= 0 && j >= 0  ; i--) {
                if (k<0){
                    nums1[i] = nums2[j--];
                }
                else if (nums2[j] >= nums1[k])
                    nums1[i] = nums2[j--];
                else
                    nums1[i] = nums1[k--];
        }
    }
}
