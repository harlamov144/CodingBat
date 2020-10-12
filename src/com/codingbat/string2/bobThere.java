package com.codingbat.string2;

/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 *
 * bobThere("abcbob") → true
 * bobThere("b9b") → true
 * bobThere("bac") → false
 */
public class bobThere {
    public boolean bobThere(String str) {
        char[] mas = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(mas[i] == 'b' && (i+2) <= str.length()-1 && mas[i+2] == 'b') return true;
        }
        return false;
    }

    public boolean bobThereOldSolution(String str) {
        if(str.length() <= 2) return false;

        char[] mas = str.toCharArray();
        for(int i = 0; i < mas.length; i++){
            if(mas[i] == 'b' && i + 2 < mas.length){
                if(mas[i+2] == 'b') return true;
            }
        }

        return false;
    }
}
