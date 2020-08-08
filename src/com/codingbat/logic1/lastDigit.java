package com.codingbat.logic1;

/**
 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
 * Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 *
 * lastDigit(23, 19, 13) → true
 * lastDigit(23, 19, 12) → false
 * lastDigit(23, 19, 3) → true
 */
public class lastDigit {
    public boolean lastDigit(int a, int b, int c) {
        a = a%10;
        b = b%10;
        c = c%10;

        return a == b || a == c || b == c;
    }

    public boolean lastDigitOldSolution(int a, int b, int c) {
        if(a%10 == b%10 || a%10 == c%10 || b%10 == c%10) return true;
        return false;
    }
}