package com.codingbat.array1;

/**
 * Given an int array length 2, return true if it contains a 2 or a 3.
 *
 * has23([2, 5]) → true
 * has23([4, 3]) → true
 * has23([4, 5]) → false
 */
public class has23 {
    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
    }

    public boolean has23OldSolution(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3) count++;
        }

        if(count > 0) return true;
        return false;
    }
}