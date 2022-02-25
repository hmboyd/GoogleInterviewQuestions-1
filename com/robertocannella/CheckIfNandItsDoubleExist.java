package com.robertocannella;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {

        Set<Double> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains((double) 2 * j) || set.contains((double) j / 2))
                return true;
            set.add((double) j);
        }
        return false;
    }
    public static boolean checkIfExistsApproachOne(int[] arr){



        return false;
    }
}
