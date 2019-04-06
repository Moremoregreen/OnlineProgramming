package com.mmg.Codility;


//給一陣列 給出缺少的數字
//EX A = {1,2,3,5,6}; 缺4
/*
假設A[]的長度是5，那代表在1~6之間一定會少一個數
例如:1 3 4 5 6，少2
為了找出少的那個數，先把數列補齊，並加總，1+2+3+4+5+6 = 21
接著把A[]內所有元素都扣掉，21-1-3-4-5-6 = 2
 */
public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {1,2,3,5,6};
        System.out.println(solution(A));

    }
    public static int solution(int[] A) {
        int length = A.length;
        int count = 0;
        for(int i =0;i<=length+1;i++){
            count+=i;
        }
        System.out.println(count);
        for(int i = 0;i<length;i++){
            count-=A[i];
        }
        System.out.println(count);
        return count;

    }
}
