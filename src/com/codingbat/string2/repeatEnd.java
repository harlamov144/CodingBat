package com.codingbat.string2;

/**
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
 * You may assume that n is between 0 and the length of the string, inclusive.
 *
 * repeatEnd("Hello", 3) → "llollollo"
 * repeatEnd("Hello", 2) → "lolo"
 * repeatEnd("Hello", 1) → "o"
 */
public class repeatEnd {
    public String repeatEnd(String str, int n) {
        String subString = str.substring(str.length() - n);
        StringBuilder res = new StringBuilder();
        for(int i = 1; i <= n; i++){
            res.append(subString);
        }
        return res.toString();
    }

    public String repeatEndOldSolution(String str, int n) {
        String res = str.substring(str.length() - n);
        String result = "";
        for(int i = 0; i < n; i++){
            result = result + res;
        }

        return result;
    }
}
