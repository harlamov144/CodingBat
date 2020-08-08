package com.codingbat.logic1;

/**
 * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number
 * is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz",
 * and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder
 * after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
 * (See also: FizzBuzz Code and Introduction to Mod)
 *
 * fizzString2(1) → "1!"
 * fizzString2(2) → "2!"
 * fizzString2(3) → "Fizz!"
 */
public class fizzString2 {
    public String fizzString2(int n) {
        boolean isDivisibleBy3 = n%3 == 0;
        boolean isDivisibleBy5 = n%5 == 0;

        if(isDivisibleBy3 && isDivisibleBy5) return "FizzBuzz!";
        if(isDivisibleBy3) return "Fizz!";
        if(isDivisibleBy5) return "Buzz!";
        return n + "!";
    }

    public String fizzString2OldSolution(int n) {
        String res = "";

        if(n%3 != 0 && n%5 != 0) return n + "!";

        if(n%3 == 0  && n%5 != 0 ) res = res + "Fizz!";
        if(n%5 == 0 && n%3 != 0) res = res + "Buzz!";
        if(n%3 == 0 && n%5 == 0) res = "FizzBuzz!";

        return res;
    }
}