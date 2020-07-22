package com.codingbat.string1;

/**
 * Given a string, return a string length 2 made of its first 2 chars. If the string length is
 * less than 2, use '@' for the missing chars.
 *
 * atFirst("hello") → "he"
 * atFirst("hi") → "hi"
 * atFirst("h") → "h@"
 */
public class atFirst {
    public String atFirst(String str) {
        String result = "";
        if(str.isEmpty()){
            result = "@@";
        }else if(str.length() == 1){
            result = str + "@";
        }else{
            result = str.substring(0, 2);
        }

        return result;
    }

    public String atFirstOldSolution(String str) {
        if(str.isEmpty()) return "@@";
        if(str.length() == 1) return str + "@";

        return str.substring(0, 2);
    }
}
