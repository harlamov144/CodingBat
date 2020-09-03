package com.codingbat.array1;

/**
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the
 * elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2
 * or more elements available between the 2 arrays.
 *
 * make2([4, 5], [1, 2, 3]) → [4, 5]
 * make2([4], [1, 2, 3]) → [4, 1]
 * make2([], [1, 2]) → [1, 2]

 */
public class make2 {
    public int[] make2(int[] a, int[] b) {
        if(a.length > 1){
            return new int[]{a[0], a[1]};
        }

        if(b.length > 1 && a.length == 0){
            return new int[]{b[0], b[1]};
        }

        return new int[]{a[0], b[0]};
    }

    public int[] make2OldSolution(int[] a, int[] b) {
        if(a.length == 0){
            int[] mas = {b[0], b[1]};
            return mas;
        }
        if(b.length == 0){
            int[] mas = {a[0], a[1]};
            return mas;
        }

        if(a.length == 1){
            int[] mas = {a[0], b[0]};
            return mas;
        }

        int[] mas = {a[0], a[1]};
        return mas;
    }
}