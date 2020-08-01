package com.codingbat.string1;

/**
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string so it is the same
 * length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
 *
 * minCat("Hello", "Hi") → "loHi"
 * minCat("Hello", "java") → "ellojava"
 * minCat("java", "Hello") → "javaello"
 */
public class minCat {
    public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int minLength = Math.min(aLength, bLength);

        return (aLength == 0 || bLength == 0) ? "" : a.substring(aLength - minLength) + b.substring(bLength - minLength);
    }

    public String minCatOldSolution(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        if(aLen == bLen){
            return a + b;
        }else{
            if(aLen > bLen){
                return a.substring(a.length()-bLen, a.length()) + b;
            }else{
                return a + b.substring(b.length()-aLen, b.length());
            }
        }
    }
}
