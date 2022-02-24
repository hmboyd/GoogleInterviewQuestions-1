package com.robertocannella;

import com.sun.source.doctree.SummaryTree;
import com.sun.source.tree.BinaryTree;

import java.util.Arrays;
import java.util.TreeSet;

public class DetermineLargestBranchBST {
    public static String solution( int [] arr){
        if(arr == null || arr.length==0) return "";


        int leftSum = 0;
        int rightSum = 0;

// we need two loops here
// one for left and one for right
// we keep track of the left and right sums separately

        int left = 1;
        int right = 2;

        leftSum = getTreeSum(arr,left);
        rightSum = getTreeSum(arr,right);

        if(leftSum > rightSum) return "Left";
        else if (leftSum < rightSum) return "Right";
        return "";

    }

    public static int getTreeSum(int arr[], int i){
        if(i> arr.length-1 || arr[i]==-1) return 0;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int sum = 0;
        if(i <arr.length){
            sum = arr[i] +getTreeSum(arr,leftChild) +getTreeSum(arr,rightChild);
        }
        return sum;
    }
}
