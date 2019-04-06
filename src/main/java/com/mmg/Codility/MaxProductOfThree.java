package com.mmg.Codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        Arrays.sort(A);
        int max1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int max2 = A[0] * A[1] * A[A.length - 1];
        int sum = Math.max(max1, max2);
        return sum;
    }
}
