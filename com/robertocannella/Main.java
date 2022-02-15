package com.robertocannella;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] randArr = getRandomArray(0,3,10000);
        int[] arr = {4,0,24,0,16,5,3,0,11};
        System.out.println(Arrays.toString(randArr));
        long startTime = System.nanoTime();
        DupicateZeros.approachOne(randArr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds
        System.out.println(duration);
        System.out.println(Arrays.toString(randArr));
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


}
