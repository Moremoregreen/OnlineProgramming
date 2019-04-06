package com.mmg.Codility;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 })));
        System.out.println(Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4, 6 })));
    }

    public static int[] solution(int N, int[] A) {
        int max = 0;
        int lastMax = 0;
        int[] counters = new int[N];

        for (int k = 0; k < A.length; k++) {
            if (A[k] >= 1 && A[k] <= N) {
                counters[A[k] - 1] = Math.max(counters[A[k] - 1], lastMax);
                counters[A[k] - 1] += 1;
                max = Math.max(max, counters[A[k] - 1]);
            } else if (A[k] == N + 1) {
                lastMax = max;
            }
        }
        for(int i = 0 ; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastMax);
        }

        return counters;

    }
}
