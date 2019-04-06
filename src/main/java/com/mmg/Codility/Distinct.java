package com.mmg.Codility;

import java.util.HashMap;
import java.util.Map;

public class Distinct {
    public static void main(String[] args) {
        int[] A = {1,3,2,2,4,1};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])){
                map.put(A[i],1);
            }
        }
        return map.size();

    }
}
