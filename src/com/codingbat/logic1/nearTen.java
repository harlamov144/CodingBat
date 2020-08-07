package com.codingbat.logic1;

/**
 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
 * remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
 *
 * nearTen(12) → true
 * nearTen(17) → false
 * nearTen(19) → true
 */
public class nearTen {
    public boolean nearTen(int num) {
        return num%10 <= 2 || num%10 >= 8;
    }

    public boolean nearTenOldSolution(int num) {
        int res = num%10;
        if(res <= 2  || res >= 8) return true;
        return false;
    }

}
