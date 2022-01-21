package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has all its "x" removed.
 *
 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 * noX(["x"]) → [""]
 */
public class noX {
    public List<String> noX(List<String> strings) {
        return strings.stream().map(t -> t.replace("x", "")).collect(Collectors.toList());
    }
}
