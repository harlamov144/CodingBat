package com.codingbat.string2;

/**
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
 * a period (.). So "xxyz" counts but "x.xyz" does not.
 *
 * xyzThere("abcxyz") → true
 * xyzThere("abc.xyz") → false
 * xyzThere("xyz.abc") → true
 */
public class xyzThere {
    public boolean xyzThere(String str) {
        int i = str.lastIndexOf("xyz");
        return i == 0 || i != -1 && str.charAt(i - 1) != '.' ;
    }

    public boolean xyzThereOldSolution(String str) {
        int i = str.indexOf("xyz");
        if(i == 0) return true;
        if(i == -1) return false;

        while(true){
            int z = str.lastIndexOf("xyz");
            str = str.substring(z-1, str.length());
            if(str.substring(0,1).equals(".")){
                return false;
            }return true;
        }
    }
}
