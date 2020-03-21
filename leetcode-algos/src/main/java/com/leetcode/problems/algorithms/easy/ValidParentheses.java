package com.leetcode.problems.algorithms.easy;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {

    /**
     * Validates the Parentheses of a String.
     *
     * Approach: Stack
     * For every open parentheses: {, [, ( add to the stack
     * When a closed parentheses is found: }, ], ), pop from stack and match
     * If same, continue, else is invalid.
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {

        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('}', '{');
        parenthesesMap.put(')', '(');
        parenthesesMap.put(']', '[');

        List<Character> openParentheses = new ArrayList<>(parenthesesMap.values());

        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {

            Character current = s.charAt(i);
            if (openParentheses.contains(current)) {
                stack.push(current);
            } else if (parenthesesMap.containsKey(current)) {
                Character expectedOpenParentheses = parenthesesMap.get(current);

                if (stack.empty())
                    return false;

                Character oParentheses = stack.pop();
                if (!expectedOpenParentheses.equals(oParentheses))
                    return false;
            }
        }

        return stack.empty();
    }


    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Parentheses.
     * Memory Usage: 37.6 MB, less than 5.06% of Java online submissions for Valid Parentheses.
     * 
     * @param s
     * @return
     */
    public static boolean isValid2(String s) {

        int n = s.length();
        char[] openParentheses = new char[] {'{', '(', '['};

        char[] stack = new char[n];
        int stackPointer = 0;

        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            int expectedIndex = -1;

            if (current == '{' || current == '(' || current == '[') {
                stack[stackPointer++] = current;
            } else if (current == '}') {
                expectedIndex = 0;
            } else if (current == ')') {
                expectedIndex = 1;
            } else if (current == ']') {
                expectedIndex = 2;
            }
            if (expectedIndex >= 0) {
                if (stackPointer == 0) return false;
                char stackValue = stack[--stackPointer];
                if (openParentheses[expectedIndex] != stackValue)
                    return false;
            }
        }
        return stackPointer == 0;
    }
}
