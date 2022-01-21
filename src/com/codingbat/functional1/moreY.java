package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 *
 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 * moreY(["yay"]) → ["yyayy"]
 */
public class moreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(t -> "y" + t + "y").collect(Collectors.toList());
    }
}
