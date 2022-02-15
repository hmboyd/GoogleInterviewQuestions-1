package com.robertocannella;
// LEETCODE

import java.util.*;

class Solution {

        public static int findNumbers(int[] nums) {
            // EASY
            // Given an array nums of integers, return how many of them contain an even number of digits.
            //
            int count = 0;

            for (int num:nums) {
                int operations = 0;
                while(num > 0) {
                    num = num / 10;
                    operations++;
                }
                if (operations%2 == 0)
                    count++;
            }
            return count;
        }
        public static int firstMissingPositive(int[] nums) {
        //hard
            Arrays.sort(nums);
            int min=1;

            for (int num : nums)
                    if (num == min)
                        min++;
            return min;
        }


    }
    class Client {

    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rd.nextInt(); // storing random integers in an array
            //System.out.println(arr[i]); // printing each array element
        }
        //int [] array = {0,2,2,1,1};
        int[] array = {12,345,2,6,7896};
        //int[] array = {3,6,3,8,431,0,-3,3,10,3,90,89,-45,-90};
        int result = Solution.findNumbers(array);
        System.out.println(result);
    }
}