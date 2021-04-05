package com.leetcode.problems.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Integer to Roman
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 *
 * There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 3
 * Output: "III"
 * Example 2:
 *
 * Input: num = 4
 * Output: "IV"
 * Example 3:
 *
 * Input: num = 9
 * Output: "IX"
 * Example 4:
 *
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 5:
 *
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= num <= 3999
 *
 */
public class IntegerToRoman {

    public static String intToRoman(int num) {

        Map<Integer, String> romanNumbersAlphabet = new HashMap<>();
        romanNumbersAlphabet.put(1,"I");
        romanNumbersAlphabet.put(5,"V");
        romanNumbersAlphabet.put(10,"X");
        romanNumbersAlphabet.put(50,"L");
        romanNumbersAlphabet.put(100,"C");
        romanNumbersAlphabet.put(500,"D");
        romanNumbersAlphabet.put(1000,"M");

        StringBuilder romanNumber = new StringBuilder();

        int divisor = 1000;

        while(divisor >= 1) {

            int currentValue = num / divisor;
            int computedValue = currentValue *  divisor;

            if (currentValue > 0 && currentValue <= 3) {
                for(int i = 0; i < currentValue; i++) romanNumber.append(romanNumbersAlphabet.get(divisor));
            } else if (currentValue == 4) {
                romanNumber.append(romanNumbersAlphabet.get(divisor));
                romanNumber.append(romanNumbersAlphabet.get(divisor * 5));
            } else if (currentValue == 5) {
                romanNumber.append(romanNumbersAlphabet.get(divisor * 5));
            } else if (currentValue > 5 && currentValue <= 8) {
                romanNumber.append(romanNumbersAlphabet.get(divisor * 5));
                for(int i = 5; i < currentValue; i++) romanNumber.append(romanNumbersAlphabet.get(divisor));
            } else if (currentValue == 9) {
                romanNumber.append(romanNumbersAlphabet.get(divisor));
                romanNumber.append(romanNumbersAlphabet.get(divisor * 10));
            }
            num -= computedValue;
            divisor = divisor / 10;
        }
        return romanNumber.toString();
    }
}