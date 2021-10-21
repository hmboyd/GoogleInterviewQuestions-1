package com.robertocannella;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[] arr = {4,17,24,11,16,5,3,99,11};
       //int[] arr = {3,99,11};
       //int[] arr = {10,13,12,14,15};
       int test = InterviewProcess.oddEvenJumps(arr);
       System.out.println(test);
    }
}
