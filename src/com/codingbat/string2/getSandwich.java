package com.codingbat.string2;

/**
 * A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
 * appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
 *
 * getSandwich("breadjambread") → "jam"
 * getSandwich("xxbreadjambreadyy") → "jam"
 * getSandwich("xxbreadyy") → ""
 */
public class getSandwich {
    public String getSandwich(String str) {
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");
        return firstIndex != lastIndex ? str.substring(firstIndex+5, lastIndex) : "";
    }

    public String getSandwichOldSolution(String str) {
        int i = str.indexOf("bread");
        int i2 = str.lastIndexOf("bread");

        if(i == i2) return "";
        return str.substring(i+5, i2);
    }
}
