package com.robertocannella;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        int j = 0; // <--offset for copying
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                j++;
                k--;
                continue;
            }
            nums[i-j] = nums[i];

        }
        return k;
    }
}
