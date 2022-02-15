package com.robertocannella;


import java.util.*;

class Solution {
        public static int firstMissingPositive(int[] nums) {

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
        int[] array = {-1,-8,3 ,4, 5,6,7,8,9,10,15};
        //int[] array = {3,6,3,8,431,0,-3,3,10,3,90,89,-45,-90};
        int test = Solution.firstMissingPositive(array);
        System.out.println(test);
    }
}