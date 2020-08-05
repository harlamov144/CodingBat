package com.codingbat.string1;

/**
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
 * and otherwise return the string unchanged.
 *
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */
public class withoutX {
    public String withoutX(String str) {
        if(str.startsWith("x")) str = str.substring(1);
        if(str.endsWith("x")) str = str.substring(0, str.length()-1);
        return str;
    }

    public String withoutXOldSolution(String str) {

        if(str.startsWith("x")){
            str = str.substring(1, str.length());
        }

        if(str.endsWith("x")){
            str = str.substring(0, str.length()-1);
        }

        return str;
    }


}
