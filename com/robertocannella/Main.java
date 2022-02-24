package com.robertocannella;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //int n = 100;

        //int[] nums1 = getRandomArray(0,50, n );
        int[] nums = {3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,2,2,2,1,1,3,3,3,3,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,4,4,4,2,2,11,1};
        Arrays.sort((nums));
        //int val = 3;

       System.out.println(Arrays.toString(nums));

        var k = RemoveDuplicates.removeDuplicates(nums);

       // System.out.println(Arrays.toString(nums1));
        System.out.println("j: " + k);

    }

    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static int[] getRandomArray(int min, int max, int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = getRandomNumberUsingNextInt(min,max);
        }
        return  arr;
    }
    public static long[] getRandomLongArray(int min, int max, int size){
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = getRandomNumberUsingNextInt(min,max);
        }
        return  arr;
    }


}
