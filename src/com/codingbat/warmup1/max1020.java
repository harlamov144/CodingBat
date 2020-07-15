package com.codingbat.warmup1;

/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0
 * if neither is in that range.
 *
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */
public class max1020 {
    public int max1020(int a, int b) {
        boolean inclusiveA = a >= 10 && a <= 20;
        boolean inclusiveB = b >= 10 && b <= 20;

        if(inclusiveA && inclusiveB){
            return Math.max(a, b);
        }

        if(inclusiveA){
            return a;
        }

        if(inclusiveB){
            return b;
        }

        return 0;
    }

    public int max1020OldSolution(int a, int b) {
        int aRange = a >= 10 && a <= 20 ? a : 0;
        int bRange = b >= 10 && b <= 20 ? b : 0;

        return Math.max(aRange, bRange);
    }

}
