package com.codingbat.string1;

/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or
 * "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 *
 * hasBad("badxx") → true
 * hasBad("xbadxx") → true
 * hasBad("xxbadxx") → false
 */
public class hasBad {
    public boolean hasBad(String str) {
        return str.length() < 4 ? str.startsWith("bad") : str.substring(0, 4).contains("bad");
    }

    public boolean hasBadOldSolution(String str) {
        if(str.length() < 3) return false;
        if(str.indexOf("bad") == 0 || str.indexOf("bad") == 1){
            return true;
        }else{
            return false;
        }
    }
}
