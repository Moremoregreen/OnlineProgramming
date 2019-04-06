package com.mmg.Codility;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] a = {3, 8, 9, 7, 6};
        int k = 3;
        System.out.println(solution(a, k));

    }

    public static int[] solution(int[] A, int K) {
        while (K > 0) {
            int[] b = new int[A.length];
            int temp = 0;
            for (int i = 0; i < A.length; i++) {
                if (i == 0) {
                    b[i] = A[A.length - 1];
                } else {
                    b[i] = A[i - 1];
                }
            }
            K--;
            A = b;
        }

        return A;
    }
}
