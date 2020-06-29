package com.codingbat.warmup1;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */
public class frontBack {
    public String frontBack(String str) {
        if(str.length() <= 1) return str;
        String start = str.substring(0, 1);
        String end = str.substring(str.length() - 1, str.length());
        return end + str.substring(1, str.length()-1) + start;
    }

    public String frontBackOldSolution(String str) {
        return (str == null || str.length() <= 1) ? str :
                str.substring(str.length()-1, str.length()) + str.substring(1, str.length()-1) +
                        str.substring(0, 1);
    }

}
