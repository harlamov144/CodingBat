package com.codingbat.logic1;

/**
 * Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only
 * answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
 *
 * answerCell(false, false, false) → true
 * answerCell(false, false, true) → false
 * answerCell(true, false, false) → false
 */
public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean canIAnswer = isMorning ? isMom : true;
        return isAsleep ? false : canIAnswer;
    }

    public boolean answerCellOldSolution(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep){
            return false;
        }else{
            if(isMorning){
                if(isMom){
                    return true;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}