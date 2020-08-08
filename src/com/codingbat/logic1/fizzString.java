package com.codingbat.logic1;

/**
 * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
 * If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
 * (See also: FizzBuzz Code)
 *
 * fizzString("fig") → "Fizz"
 * fizzString("dib") → "Buzz"
 * fizzString("fib") → "FizzBuzz"
 */
public class fizzString {
    public String fizzString(String str) {
        String result = "";
        if(str.startsWith("f")) result = "Fizz";
        if(str.endsWith("b")) result = result + "Buzz";

        if(!str.startsWith("f") && !str.endsWith("b")){
            result = str;
        }

        return result;
    }

    public String fizzStringOldSolution(String str) {
        if(str.isEmpty()) return str;

        boolean f = str.startsWith("f");
        boolean b = str.endsWith("b");

        String res = "";

        if(f) res = res + "Fizz";
        if(b) res = res + "Buzz";

        if(f == false && b == false) return str;

        return res;
    }


}
