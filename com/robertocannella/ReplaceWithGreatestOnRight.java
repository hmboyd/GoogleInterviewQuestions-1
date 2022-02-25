package com.robertocannella;

public class ReplaceWithGreatestOnRight {
    public static int[] replaceElements(int[] arr) {
        int i = arr.length-1;
        int max = -1;
        while(i >= 0) {
            if(arr[i] > max) {
                int t = max;
                max = arr[i];
                arr[i--] = t;
                continue;
            }
            arr[i--] = max;
        }
        return arr;
    }
}
