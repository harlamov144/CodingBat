package com.codingbat.string2;

/**
 * Return the number of times that the string "hi" appears anywhere in the given string.
 *
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */
public class countHi {
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i') count++;
        }
        return count;
    }

    public int countHiOldSolution(String str) {
        if(str.length() <= 1 ) return 0;
        int count = 0;

        while(true){
            int i = str.indexOf("hi");
            if(i != -1){
                count++;
            }else{
                break;
            }

            str = str.substring(i+2, str.length());
        }

        return count;
    }
}
