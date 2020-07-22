package com.codingbat.string1;

/**
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo"
 * and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 *
 * lastChars("last", "chars") → "ls"
 * lastChars("yo", "java") → "ya"
 * lastChars("hi", "") → "h@"
 */
public class lastChars {
    public String lastChars(String a, String b) {
        String firstLetter = a.isEmpty() ? "@" : a.substring(0, 1);
        String lastLetter = b.isEmpty() ? "@" : b.substring(b.length()-1);

        return firstLetter + lastLetter;
    }

    public String lastCharsOldSolution(String a, String b) {
        String start = "";
        String end = "";

        if(a.isEmpty()){
            start = "@";
        }else{
            start = a.substring(0, 1);
        }

        if(b.isEmpty()){
            end = "@";
        }else{
            end = b.substring(b.length()-1, b.length());
        }

        return start + end;
    }


}
