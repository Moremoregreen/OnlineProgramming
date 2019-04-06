package com.mmg.Codility;

//DEMO題目
//找出陣列中不存在的最小正整數(不可為0)
public class FindSmallNumNotOccur {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int tmp;
        int num = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j]) {
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (num == A[i])num++;
        }
        return num;
    }
}
