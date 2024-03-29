package com.leetcode.problems.algorithms.easy;


/**
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
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 *
 * Example 1:
 *
 * Input: "III"
 * Output: 3
 * Example 2:
 *
 * Input: "IV"
 * Output: 4
 * Example 3:
 *
 * Input: "IX"
 * Output: 9
 * Example 4:
 *
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 *
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomanToInteger {


    public static int romanToInt(String s) {
        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'M') {
                result += 1000;
            } else if (currentChar == 'C') {
                if (i + 1 == n) {
                    result += 100;
                    continue;
                }
                char nextChar = s.charAt(i + 1);
                if (nextChar == 'M') {
                    i++;
                    result += 900;
                } else if (nextChar == 'D') {
                    i++;
                    result += 400;
                }else {
                    result += 100;
                }
            } else if (currentChar == 'X') {
                if (i + 1 == n) {
                    result += 10;
                    continue;
                }
                char nextChar = s.charAt(i + 1);
                if (nextChar == 'C') {
                    i++;
                    result += 90;
                } else if (nextChar == 'L') {
                    i++;
                    result += 40;
                }else {
                    result += 10;
                }
            } else if (currentChar == 'D') {
                result += 500;
            } else if (currentChar == 'L') {
                result += 50;
            } else if (currentChar == 'V') {
                result += 5;
            } else if (currentChar == 'I') {
                if (i + 1 == n) {
                    result += 1;
                    continue;
                }
                char nextChar = s.charAt(i + 1);
                if (nextChar == 'X') {
                    i++;
                    result += 9;
                } else if (nextChar == 'V') {
                    i++;
                    result += 4;
                } else {
                    result += 1;
                }
            }
        }

        return result;
    }

    public static int romanToIntReDo(String s) {

        int n = s.length();
        int result = 0;
        //Roman Numbers Characters: I V X L C M;

        for (int i = 0; i < n; i++) {

            char current = s.charAt(i);

            if (current == 'V') {
                result += 5;
            } else if (current == 'L') {
                result += 50;
            } else if (current == 'D') {
                result += 500;
            }else if (current == 'M') {
                result += 1000;
            } else if (current == 'I') {
                if (i + 1 == n) {
                    result += 1;
                    continue;
                }
                char nextChar = s.charAt(i + 1);
                if (nextChar == 'V') {
                    i++;
                    result += 4;
                } else if (nextChar == 'X') {
                    i++;
                    result += 9;
                } else {
                    result += 1;
                }
            } else if (current == 'X') {
                if (i + 1 == n) {
                    result += 10;
                    continue;
                }
                char nextChar = s.charAt(i + 1);
                if (nextChar == 'L') {
                    i++;
                    result += 40;
                } else if (nextChar == 'C') {
                    i++;
                    result += 90;
                } else {
                    result += 10;
                }

            } else if (current == 'C') {
                if (i + 1 == n) {
                    result += 100;
                    continue;
                }
                char nextChar = s.charAt(i + 1);
                if (nextChar == 'D') {
                    i++;
                    result += 400;
                } else if (nextChar == 'M') {
                    i++;
                    result += 900;
                } else {
                    result += 100;
                }
            }
        }

        return result;
    }

}
