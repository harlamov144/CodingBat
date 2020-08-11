package com.codingbat.logic1;

/**
 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
 * If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits
 * of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
 *
 * sumLimit(2, 3) → 5
 * sumLimit(8, 3) → 8
 * sumLimit(8, 1) → 9
 */
public class sumLimit {
    public int sumLimit(int a, int b) {
        int aLength = String.valueOf(a).length();
        int sum = a + b;
        int sumLength = String.valueOf(sum).length();

        return aLength == sumLength ? sum : a;
    }

    public int sumLimitOldSolution(int a, int b) {
        int res = a + b;
        String str = String.valueOf(res);
        int count = str.length();

        String aStr = String.valueOf(a);
        int aCount = aStr.length();

        if(count > aCount) return a;
        return res;
    }
}