package com.mmg.Codility;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A={9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            elem ^= A[i];
        }
        return elem;
    }
}
