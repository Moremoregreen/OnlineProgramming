package com.mmg.Codility;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    public static int solution(int N) {
        String n = Integer.toBinaryString(N);
        int gap = 0;
        boolean gotOne = false;
        for (int i = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                i++;
            } else {
                if (i > gap && gotOne) {
                    gap = i;
                }
                gotOne = true;
                i = 0;
            }
        }
        return gap;
    }
}
