package com.codingbat.string2;

/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 *
 * catDog("catdog") → true
 * catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */
public class catDog {
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for(int i = 0; i < str.length()-2; i++){
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') countCat++;
            if(str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g') countDog++;
        }

        return countCat == countDog;
    }

    public boolean catDogOldSolution(String str) {

        // if(str.length() <= 5) return false;

        String strDog = str;
        int countCat = 0;
        int countDog = 0;

        while(true){
            int i = str.indexOf("cat");
            if(i!=-1){
                countCat++;
            }else{
                break;
            }
            str = str.substring(i+3, str.length());
        }

        while(true){
            int i = strDog.indexOf("dog");
            if(i!=-1){
                countDog++;
            }else{
                break;
            }
            strDog = strDog.substring(i+3, strDog.length());
        }

        if(countCat == countDog) return true;
        return false;

    }
}
