package com.codingbat.warmup1;

/**
 * Return true if the given string contains between 1 and 3 'e' chars.
 *
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */
public class stringE {
    public boolean stringE(String str) {
        char[] strArray = str.toCharArray();
        int equalsCount = 0;
        for (char c : strArray) {
            if(c == 'e') {
                equalsCount++;
            }
        }
        return equalsCount >=1 && equalsCount <= 3;
    }
}
