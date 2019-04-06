package com.mmg.Codility;

import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {

    }
    public static int solution(int[] A) {
        boolean[] seen = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            if(A[i] < 1 || A[i] > A.length) return 0;
            if(seen[A[i]]) return 0;
            else seen[A[i]] = true;
        }
        return 1;
    }
}
