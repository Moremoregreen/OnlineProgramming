package com.mmg.Codility;

public class TapeEquilibrium {
    public static void main(String[] args) {

    }
    public static int solution(int[] A) {
        int sum = 0;
        int diff = 0;
        int min=0;
        for(int i = 0; i<A.length; i++) {
            sum += A[i];
        }
        for(int i = 0; i<A.length-1; i++) {
            diff = 0;
            sum = sum - 2*A[i];
            diff = Math.abs(sum);
            if(i == 0) {
                min = diff;
            } else {
                if(diff < min)
                    min = diff;
            }
        }
        return min;
    }
}
