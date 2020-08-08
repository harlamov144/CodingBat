package com.codingbat.logic1;

/**
 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 *
 * twoAsOne(1, 2, 3) → true
 * twoAsOne(3, 1, 2) → true
 * twoAsOne(3, 2, 2) → false
 */
public class twoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        return a+b == c || a+c == b || b+c == a;
    }

    public boolean twoAsOneOldSolution(int a, int b, int c) {
        int num1 = a+b;
        int num2 = a+c;
        int num3 = b+c;

        if(num1 == c || num2 == b|| num3 == a) return true;
        return false;
    }
}