package com.codingbat.string2;

/**
 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the
 * second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 *
 * mixString("abc", "xyz") → "axbycz"
 * mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 */
public class mixString {
    public String mixString(String a, String b) {
        int min = Math.min(a.length(), b.length());

        char[] aMas = a.substring(0, min).toCharArray();
        char[] bMas = b.substring(0, min).toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < min; i++){
            result.append(aMas[i]).append(bMas[i]);
        }

        return  result.append(a.substring(min)).append(b.substring(min)).toString();
    }

    public String mixStringOldSolution(String a, String b) {
        String min = "";
        String odd = "";
        StringBuilder str = new StringBuilder();

        if(a.length() > b.length()){
            min = a.substring(0, b.length());
            odd = a.substring(b.length());

            char[] minStr = min.toCharArray();
            char[] bStr = b.toCharArray();

            for(int i = 0; i < min.length(); i++){
                str = str.append(minStr[i]).append(bStr[i]);
            }

            return str.append(odd).toString();

        }else{
            min = b.substring(0, a.length());
            odd = b.substring(a.length());

            char[] minStr = min.toCharArray();
            char[] aStr = a.toCharArray();

            for(int i = 0; i < min.length(); i++){
                str = str.append(aStr[i]).append(minStr[i]);
            }

            return str.append(odd).toString();
        }
    }
}
