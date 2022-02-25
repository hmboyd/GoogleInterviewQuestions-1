package com.robertocannella;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //int n = 100;

        //int[] nums1 = getRandomArray(0,50, n );
        //int[] nums = {1,2,3,5,7,9,10,12,14,15,16,18,14,13};
        //int[] nums = {1,1,1,1,1,1,1,2,1};
        //int[] nums = {1,2,3,4,3,2,1};
        //int[] nums = {0,2,3,3,5,2,1,0};
        //int[] nums = {17,18,5,4,6,1};
        int[] nums = {0,1,0,1,0,1,0,1,0,1};
        //int val = 3;

       System.out.println(Arrays.toString(nums));

       MoveZeros.moveZeroes(nums);

       // System.out.println(Arrays.toString(nums1));
       // System.out.println("res: " + Arrays.toString(res));

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
