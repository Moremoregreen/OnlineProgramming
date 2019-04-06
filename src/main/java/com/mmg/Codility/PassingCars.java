package com.mmg.Codility;

public class PassingCars {
    public static void main(String[] args) {

    }

    public static int solution(int[] A) {
        int countOne = 0;
        int countZero= 0;
        int pair = 0;
        int counter = 0;
        for (int i = A.length-1; i>=0;i--){
            counter++;
            if (A[i]==1){
                countOne++;
            } else if (A[i]==0){
                countZero++;
                pair += counter-countZero;
                if (pair > 1000000000){
                    return -1;
                }
            }
        }
        return pair;
    }

    public static int solution2(int[] A) {
        int zCount = 0;
        int total = 0;
        for(int i =0;i<A.length;i++){
            if(A[i] == 0){
                zCount++;
            }else{
                total +=zCount;
            }
        }
        if(Math.abs(total) > 1000000000){
            return -1;
        }
        return total;
    }

}
