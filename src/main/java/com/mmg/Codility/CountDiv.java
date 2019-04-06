package com.mmg.Codility;

public class CountDiv {
    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }
    public static int solution(int A, int B, int K) {
        System.out.println("B/K="+B/K + " A/K= " +A/K +" A%K="+A%K);
        System.out.println("A%K == 0 ? 1 : 0 = " + (A%K == 0 ? 1 : 0));
        System.out.println("(B/K) - (A/K) = " + ((B/K) - (A/K)));
        return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);

    }
}
