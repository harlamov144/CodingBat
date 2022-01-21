package com.codingbat.functinal2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the
 * resulting numbers that end in 5 or 6.
 *
 * square56([3, 1, 4]) → [19, 11]
 * square56([1]) → [11]
 * square56([2]) → [14]
 */
public class square56 {
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(t -> t*t + 10).filter(t -> t%10 != 5 && t%10 != 6).collect(Collectors.toList());
    }
}
