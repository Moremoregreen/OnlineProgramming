package com.mmg.Codility;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {-1,-2,1,3};
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int res =1;
        if(A.length<1)return 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i]==res){
                res++;
            }
        }
        return res;
    }
}
