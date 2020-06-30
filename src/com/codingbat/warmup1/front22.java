package com.codingbat.warmup1;

/**
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
 * so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
 *
 * front22("kitten") → "kikittenki"
 * front22("Ha") → "HaHaHa"
 * front22("abc") → "ababcab"
 */
public class front22 {
    public String front22(String str) {
        String start = str.length() < 2 ? str : str.substring(0, 2);
        return start + str + start;
    }

    public String front22OldSolution(String str) {
        if(str.length() > 2){
            String start = str.substring(0, 2);
            return start + str + start;
        }else{
            return str + str + str;
        }
    }

}
