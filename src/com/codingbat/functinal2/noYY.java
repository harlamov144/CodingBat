package com.codingbat.functinal2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
 *
 * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
 * noYY(["a", "b", "cy"]) → ["ay", "by"]
 * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */
public class noYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(t -> t + "y").filter(t -> !t.contains("yy")).collect(Collectors.toList());
    }

}
