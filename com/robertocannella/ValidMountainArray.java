package com.robertocannella;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        boolean increasing = false;
        boolean decreasing = false;

        if (arr.length < 3) return false; //  <-- // we cannot climb and descend in two steps

        for (int i = 1; i < arr.length; i++) {
            if (!increasing && arr[i-1] > arr[i])  // <-- EDGE CASE - if we start a descent and haven't climbed, return false.
                    return false;
            if (arr[i-1] == arr[i])  //  <-- If we are neither climbing nor descending, return false.
                    return false;
            if (arr[i-1] < arr [i] && !decreasing) { //  <-- We are climbing.  Validate we haven't been decending
                increasing = true;
                continue;
            }
            if (arr[i-1] > arr[i]) {// <-- We can only flag descending if we have begun to climb
                decreasing = true;
                continue;
            }
            if (decreasing && arr[i-1] < arr[i])
                return false;
        }

        return decreasing;   // decreasing will only be true in a valid Mountain Array
    }
}
