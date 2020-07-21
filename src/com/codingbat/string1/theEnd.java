package com.codingbat.string1;

/**
 * Given a string, return a string length 1 from its front, unless front is false,
 * in which case return a string length 1 from its back. The string will be non-empty.*
 *
 * theEnd("Hello", true) → "H"
 * theEnd("Hello", false) → "o"
 * theEnd("oh", true) → "o"
 */
public class theEnd {
    public String theEnd(String str, boolean front) {
        return front ? String.valueOf(str.charAt(0)) :  String.valueOf(str.charAt(str.length()-1));
    }

    public String theEndOldSolution(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length()-1);
    }
}
