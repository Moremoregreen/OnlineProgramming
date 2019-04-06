package com.mmg.Codility;
import java.util.HashSet;
//https://app.codility.com/demo/results/training2M4WXP-CGW/
public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

        System.out.println(solution(5,A));
    }
    public static int solution(int X, int[] A) {
        HashSet<Integer> fallen = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            fallen.add(A[i]);
            if (fallen.size() == X)
                return i;
        }
        return -1;
    }
}
