package com.codingbat.functinal2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
 *
 * no34(["a", "bb", "ccc"]) → ["a", "bb"]
 * no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
 * no34(["ccc", "dddd", "apple"]) → ["apple"]
 */
public class no34 {
    public List<String> no34(List<String> strings) {
        return strings.stream().filter(t -> t.length() != 3 && t.length() != 4).collect(Collectors.toList());
    }
}
