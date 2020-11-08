package com.codingbat.string2;

/**
 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
 * separated by the separator string.
 *
 * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 * repeatSeparator("This", "And", 2) → "ThisAndThis"
 * repeatSeparator("This", "And", 1) → "This"
 */
public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if(count == 0) return "";

        StringBuilder res = new StringBuilder(word);
        for(int i = 1; i < count; i++){
            res.append(sep).append(word);
        }
        return res.toString();
    }

    public String repeatSeparatorOldSoution(String word, String sep, int count) {
        if(count == 0) return "";
        if(count == 1) return word;
        StringBuilder res = new StringBuilder();


        for(int i = 0; i < count; i++){
            res = res.append(word).append(sep);
        }

        return res.substring(0, res.length()-sep.length()).toString();
    }


}
