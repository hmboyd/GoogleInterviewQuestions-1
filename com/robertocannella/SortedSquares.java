package com.robertocannella;

// Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
// https://leetcode.com/problems/squares-of-a-sorted-array/solution/
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class SortedSquares {
    public static int[] approachOne(int[] A) {
        // Time Complexity O(N log N) Where N is the length of A
        // Space Complexity O(N) or O(log N) dependent on the algorithm Arrays.sort is 0(log)
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;

    }

    public static int[] approachTwo(int[] nums) {
        // Time Complexity O(N) Where N is the length of A
        // Space Complexity O(N) if we take into account output, or O(1) otherwise
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
            System.out.println(Arrays.toString(result));
            System.out.println("loop");
        }
        return result;
    }

}
