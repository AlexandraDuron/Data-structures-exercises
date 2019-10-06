/*  Stack Brackets Example

A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, 

AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

https://www.hackerrank.com/challenges/java-stack/problem */

public class Test {
	// Test section
    public static void main(String []args)
    {
        Solution solution = new Solution();
        solution.readFile();
        solution.checkSecuence();
    }
}
