package com.codingbat.logic1;

/**
 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
 * such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives
 * the right digit.)
 *
 * shareDigit(12, 23) → true
 * shareDigit(12, 43) → false
 * shareDigit(12, 44) → false
 */
public class shareDigit {
    public boolean shareDigit(int a, int b) {
        int aLeft = a/10;
        int aRight = a%10;

        int bLeft = b/10;
        int bRight = b%10;

        return aLeft == bLeft || aLeft == bRight ||
                aRight == bRight || aRight == bLeft;
    }

    public boolean shareDigitOldSolution(int a, int b) {
        int aLeft = a/10;
        int aRight = a%10;

        int bLeft = b/10;
        int bRight = b%10;

        if(aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight) return true;
        return false;
    }
}