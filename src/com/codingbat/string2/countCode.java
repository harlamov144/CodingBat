package com.codingbat.string2;

/**
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any
 * letter for the 'd', so "cope" and "cooe" count.
 *
 * countCode("aaacodebbb") → 1
 * countCode("codexxcode") → 2
 * countCode("cozexxcope") → 2
 */
public class countCode {
    public int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-3; i++){
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e') count ++;
        }

        return count;
    }

    public int countCodeOldSolution(String str) {
        if(str.length() <= 3) return 0;

        char[] mas = str.toCharArray();
        int count = 0;
        for(int i = 0; i < mas.length; i++){
            if(mas[i] == 'c' && i+3 < mas.length){
                if(mas[i+1] == 'o'){
                    if(mas[i+3] == 'e'){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
