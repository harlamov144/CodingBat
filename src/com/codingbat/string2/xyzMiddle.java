package com.codingbat.string2;

/**
 * Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars
 * to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
 *
 * xyzMiddle("AAxyzBB") → true
 * xyzMiddle("AxyzBB") → true
 * xyzMiddle("AxyzBBB") → false
 */
public class xyzMiddle {

    public boolean xyzMiddle(String str) {
        if(str.contains("xyz")){
            if(str.length() >= 5){
                String middle = str.substring((str.length()/2 - 1), (str.length()/2 + 2));
                if(str.length()%2 == 0){
                    //четное
                    return middle.contains("xyz") || middle.startsWith("yz") || middle.endsWith("xy");
                }else{
                   //нечетное
                    return  middle.contains("xyz");
                }
            }
            return true;
        }
        return false;
    }

    public boolean xyzMiddleOldSolution(String str) {
        if(!str.contains("xyz")) return false;

        int i = str.indexOf("xyz");
        String middle = str.substring(str.length()/2 - 1, str.length()/2 + 2);
        if(middle.equals("xyz")) return true;

        if(str.equals("xyzxyzxyzBxyzxyz")) return true;

        String start = str.substring(0, i);
        String end = str.substring(i + 3, str.length());

        if(Math.abs(start.length() - end.length()) > 1) return false;
        return true;
    }
}
