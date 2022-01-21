package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "*" added at its end.
 *
 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) → ["hello*", "there*"]
 * addStar(["*"]) → ["**"]
 */
public class addStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(t -> t + "*").collect(Collectors.toList());
    }
}
