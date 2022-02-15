package com.robertocannella;
// Given a fixed-length integer array arr, duplicate each occurrence of zero,
// shifting the remaining elements to the right.
public class DupicateZeros {
    public static void approachOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length-1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
    public static void approachTwo(int[] arr) {
        int possibleDups = 0;
        int len = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int i = 0; i <= len - possibleDups; i++) {

            // Count the zeros
            if (arr[i] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (i == len - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[len] = 0;
                    len -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = len - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

}
