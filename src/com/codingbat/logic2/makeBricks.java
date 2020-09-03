package com.codingbat.logic2;

/**
 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
 * and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
 * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


 makeBricks(3, 1, 8) → true
 makeBricks(3, 1, 9) → false
 makeBricks(3, 2, 10) → true
 */
public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int big5 = big * 5;

        if(small + big5 == goal || big5 == goal || small >= goal) return true;
        if(big5 < goal && goal - big5  <= small) return true;
        if(big5 > goal && goal%5 <= small ) return true;

        return false;
    }

    public boolean makeBricksOldSolution(int small, int big, int goal) {
        big = big*5;

        if(goal%5 == 0){
            if(goal <= big) return true;
            else{
                if(goal <= big + small) return true;
                return false;
            }
        }else{
            if(big <= goal){
                if(big+small >= goal) return true;
                return false;
            }
            if(big > goal){
                int i = goal%10;
                if(i > 0 && goal > 10){
                    if(i <= small) return true;
                }
                if(goal < 10){
                    if(goal - small <= 5) return true;
                }
            }

        }
        return false;
    }

}
