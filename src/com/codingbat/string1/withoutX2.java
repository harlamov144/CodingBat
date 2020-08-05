package com.codingbat.string1;

/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
 * and otherwise return the string unchanged. This is a little harder than it looks.
 *
 * withoutX2("xHi") → "Hi"
 * withoutX2("Hxi") → "Hi"
 * withoutX2("Hi") → "Hi"
 */
public class withoutX2 {
    public String withoutX2(String str) {
        if(str.length() <= 1){
            return str.equals("x") ? "" : str;
        }else{
            String firstChar = str.substring(0, 1).equals("x") ? "" : str.substring(0, 1);
            String secondChar = str.substring(1, 2).equals("x") ? "" : str.substring(1, 2);
            return firstChar + secondChar + str.substring(2);
        }
    }

    public String withoutX2OldSoltion(String str) {
        if(str.isEmpty()) return str;

        if(str.length() == 1){
            if(str.startsWith("x")){
                return "";
            }else{
                return str;
            }
        }

        String start = str.substring(0, 1);
        String second = str.substring(1, 2);

        if(start.equals("x")) start = "";
        if(second.equals("x")) second = "";

        if(str.length() == 2){
            return start + second;
        }else{
            return start + second + str.substring(2, str.length());
        }
    }

}
