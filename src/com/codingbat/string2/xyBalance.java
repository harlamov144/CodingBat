package com.codingbat.string2;

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere
 * later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
 * Return true if the given string is xy-balanced.
 *
 * xyBalance("aaxbby") → true
 * xyBalance("aaxbb") → false
 * xyBalance("yaaxbb") → false
 */
public class xyBalance {
    public boolean xyBalance(String str) {
        int xInd = str.lastIndexOf('x');
        int yInd = str.lastIndexOf('y');
        return yInd > xInd || xInd == -1;
    }

    public boolean xyBalanceOldSolution(String str) {
        if(str.length() == 0) return true;

        int i = str.lastIndexOf("x");
        int b = str.lastIndexOf("y");

        if(i == -1 && b == -1) return true;

        if(b > i) return true;
        return false;
    }
}
