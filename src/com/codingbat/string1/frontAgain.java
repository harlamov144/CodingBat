package com.codingbat.string1;

import java.util.Objects;

/**
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string,
 * such as with "edited".
 *
 * frontAgain("edited") → true
 * frontAgain("edit") → false
 * frontAgain("ed") → true
 */
public class frontAgain {
    public boolean frontAgain(String str) {
        return str.length() > 1 && Objects.equals(str.substring(0, 2), str.substring(str.length() - 2));
    }

    public boolean frontAgainOldSolution(String str) {
        if(str.length() < 2){
            return false;
        }else{
            if(str.substring(0, 2).equals(str.substring(str.length()-2, str.length()))){
                return true;
            }else{
                return false;
            }
        }
    }
}
