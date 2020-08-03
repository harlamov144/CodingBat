package com.codingbat.string1;

/**
 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
 * keep the second char if it is 'b'. The string may be any length. Harder than it looks.
 *
 * deFront("Hello") → "llo"
 * deFront("java") → "va"
 * deFront("away") → "aay"
 */
public class deFront {
    public String deFront(String str) {
        String firstChar = str.length() > 0 && str.substring(0, 1).equals("a")
                ? str.substring(0, 1) :  "";
        String secondChar = str.length() > 1 && str.substring(1, 2).equals("b")
                ? str.substring(1, 2) :  "";

        if(str.length() < 2){
            return firstChar;
        }else{
            return firstChar + secondChar + str.substring(2);
        }
    }

    public String deFrontOldSolution(String str) {
        if(str.isEmpty()) return str;

        if(str.length() == 1){
            if(str.equals("a")){
                return str;
            }else{
                return "";
            }
        }

        String first = str.substring(0, 1);
        String second = str.substring(1, 2);
        String res = "";

        if(first.equals("a")) res = res + "a";
        if(second.equals("b")) res = res + "b";

        if(str.length() == 2){
            return res;
        }else{
            return res + str.substring(2, str.length());
        }

    }
}
