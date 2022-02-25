package com.robertocannella;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        if (nums == null)
            return;

        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeros++;
                continue;
            }
            nums[i-zeros] = nums[i];
            if(zeros > 0)
                 nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
