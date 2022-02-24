package com.robertocannella;


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] randArr = getRandomArray(0,70000,10000);
        int[] arr = {3,6,2,9,-1,10};
        //System.out.println(Arrays.toString(randArr));
        //long startTime = System.nanoTime();
        var result = DetermineLargestBranchBST.solution(arr);
        //long endTime = System.nanoTime();
        //long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds
        //System.out.println(duration);
        System.out.println(result);

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
