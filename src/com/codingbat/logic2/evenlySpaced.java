package com.codingbat.logic2;

/**
 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are
 * evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
 *
 * evenlySpaced(2, 4, 6) → true
 * evenlySpaced(4, 6, 2) → true
 * evenlySpaced(4, 6, 3) → false
 */
public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int medium = (a > b && a < c) ||  (a > c && a < b) ? a :
                (b > a && b < c) ||  (b > c && b < a) ? b : c;

        return Math.abs(large - medium) == Math.abs(medium - small);
    }
}
