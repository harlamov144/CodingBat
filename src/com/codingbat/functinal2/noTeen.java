package com.codingbat.functinal2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
 *
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 */
public class noTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(t -> t < 13 || t > 19).collect(Collectors.toList());
    }
}