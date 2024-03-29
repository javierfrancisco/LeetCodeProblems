package com.leetcode.problems.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
 *
 */
public class PalindromeNumber
{
    public boolean isPalindrome2(int x) {
        
        if (x < 0) {
            return false;
        }
        //Convert to string
        String value = Integer.toString(x);
        //get length
        int n = value.length();
        if (n == 1) {
            return true;
        }
        int isEven = n % 2;
        char[] values = value.toCharArray();
        //for from 0 to length/2
        int m = ((values.length - isEven) / 2) - 1 ;
        int j = values.length - 1;
        for (int i = 0; i <= m; i++ ){
            if (values[i] != values[j]) {
                return false;
            }
            j--;                
        }
        return true;
    }

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        //Idea, create a reverse of the second half of the array
        // eg. 1221, arr1 = 12 , arr2 = 12
        // then compare

        int revertedNumber = 0;

        while (x > revertedNumber) {
            
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        //if even remove a digit

        return x == revertedNumber || x == revertedNumber / 10;
    }        
}
