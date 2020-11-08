package com.codingbat.string2;

/**
 * Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1
 * characters of the string, and so on. You may assume that n is between 0 and the length of the string,
 * inclusive (i.e. n >= 0 and n <= str.length()).
 *
 * repeatFront("Chocolate", 4) → "ChocChoChC"
 * repeatFront("Chocolate", 3) → "ChoChC"
 * repeatFront("Ice Cream", 2) → "IcI"
 */
public class repeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = 1, k = n; i <= n; i++, k--){
            String subString = str.substring(0, k);
            res.append(subString);
        }
        return res.toString();
    }

    public String repeatFrontOldSolution(String str, int n) {
        if(n == 0) return "";
        StringBuilder res = new StringBuilder();

        for(int i = n; i > 0; i--){
            res = res.append(str.substring(0, i));
        }

        return res.toString();
    }
}
