package com.codingbat.warmup1;

/**
 * Given three int values, a b c, return the largest.
 *
 * intMax(1, 2, 3) → 3
 * intMax(1, 3, 2) → 3
 * intMax(3, 2, 1) → 3
 */
public class intMax {
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public int intMaxOldSolution(int a, int b, int c) {
        return Math.max(c, Math.max(a, b));
    }

}
