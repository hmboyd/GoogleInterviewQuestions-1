package com.robertocannella;


import java.util.*;

class Solution {
        public static int firstMissingPositive(int[] nums) {


            int currentItem = 0;
            int nextItem = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i = 0; i <nums.length -1 ; i++) {
                if (nums[i] > 0) {
                        if (!pq.contains(nums[i]))
                            pq.add(nums[i]);
                }
            }

            if (pq.peek() == null)
                return 1;
            if (pq.peek() > 1)
                return 1;

            while(!pq.isEmpty()) {
                currentItem = pq.poll();
                if (pq.peek() == null)
                    break;
                nextItem = pq.peek();
               if (nextItem - currentItem == 1 ){
                   continue;
               }
               break;
            }
            return currentItem  + 1;
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
        int [] array = {0,2,2,1,1};
        // int[] array = {-1,-8,3 ,4, 5,6,7,8,9,10,15};
        //int[] array = {3,6,3,8,431,0,-3,3,10,3,90,89,-45,-90};
        int test = Solution.firstMissingPositive(array);
        System.out.println(test);
    }
}