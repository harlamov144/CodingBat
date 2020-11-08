package com.codingbat.string2;

/**
 * Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear
 * somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
 *
 * prefixAgain("abXYabc", 1) → true
 * prefixAgain("abXYabc", 2) → true
 * prefixAgain("abXYabc", 3) → false
 */
public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);
    }

    public boolean prefixAgainOldSolution(String str, int n) {
        String res = str.substring(0, n);

        if(str.substring(n, str.length()).indexOf(res) != -1) return true;
        return false;
    }
}
