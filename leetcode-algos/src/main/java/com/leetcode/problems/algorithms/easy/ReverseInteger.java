package com.leetcode.problems.algorithms.easy;


/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when
 * the reversed integer overflows.
 */
public class ReverseInteger {


    public static int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs((long) x)).reverse().toString();
        double reverseInteger = x < 0 ? Double.parseDouble(reversed) * -1 : Double.parseDouble(reversed);
        return reverseInteger > Integer.MAX_VALUE || reverseInteger < Integer.MIN_VALUE ? 0 : (int) reverseInteger;
    }


}
