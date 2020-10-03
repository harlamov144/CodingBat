package com.codingbat.string2;

/**
 * Given a string, return a string where for every char in the original, there are two chars.
 *
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class doubleChar {
    public String doubleChar(String str) {
        StringBuilder res = new StringBuilder();
        for(Character s : str.toCharArray()){
            res.append(s).append(s);
        }
        return res.toString();
    }

    public String doubleCharOldSolution(String str) {
        char[] mas = str.toCharArray();
        StringBuilder res = new StringBuilder();;
        for(int i = 0; i < str.length(); i++){
            res = res.append(mas[i]);
            res = res.append(mas[i]);
        }

        return res.toString();
    }
}
