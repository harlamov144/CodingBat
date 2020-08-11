package com.codingbat.logic1;

/**
 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2,
 * the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are
 * different from a, the result is 1. Otherwise the result is 0.
 *
 * redTicket(2, 2, 2) → 10
 * redTicket(2, 2, 1) → 0
 * redTicket(0, 0, 0) → 5
 */
public class redTicket {
    public int redTicket(int a, int b, int c) {
        if(a == b && a == c){
            return a == 2 ? 10 : 5;
        }

        return b != a && c != a ? 1 : 0;
    }

    public int redTicketOldSolution(int a, int b, int c) {
        if(a == 2 && b == a && c == a) return 10;
        if(a == b && c == b) return 5;
        if(a!=b && a!=c) return 1;

        return 0;
    }
}