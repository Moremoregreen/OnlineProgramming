package com.mmg.Codility;

public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(solution(10,85,30));
    }
    public static int solution(int X, int Y, int D) {
        int dis = Y-X;
        int times = dis/D;
        int remain = dis%D;
        if(remain>0)times++;
        return times;
    }
}
