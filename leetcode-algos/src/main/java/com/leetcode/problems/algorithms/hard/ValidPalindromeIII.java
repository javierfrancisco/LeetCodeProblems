package com.leetcode.problems.algorithms.hard;



/**
 * Given a string s and an integer k, return true if s is a k-palindrome.

A string is k-palindrome if it can be transformed into a palindrome by removing
at most k characters from it.

Example 1:

Input: s = "abcdeca", k = 2
Output: true
Explanation: Remove 'b' and 'e' characters.
Example 2:

Input: s = "abbababa", k = 1
Output: true
 

Constraints:

1 <= s.length <= 1000
s consists of only lowercase English letters.
1 <= k <= s.length
 */
public class ValidPalindromeIII {

    //Idea: create a helper function that outpus the least cost of having a palindrome
    public boolean isValidPalindrome(String s, int k) {
    
        
        int i = 0;
        int j = s.length();
        Integer[][] memo = new Integer[j][j];

        return isValidPalindrome(s, i, j, memo) <= k;
    }

    private int isValidPalindrome(String s, int i, int j, Integer[][] memo) {

        // one char:
        if (i == j) {
            return 0;
        }
        // two chars
        if (i == j - 1) {
            if (s.charAt(i) == s.charAt(j)) {
                return 0;
            } else {
                return 1;
            }
        }

        if (memo[i][j] != null) {
            return memo[i][j];
        }


        //else
        if (s.charAt(i) == s.charAt(j)) {
            return memo[i][j] = isValidPalindrome(s, i+1, j-1, memo);
        }


        return memo[i][j] = 1 +  Math.min(isValidPalindrome(s, i+1, j, memo), isValidPalindrome(s, i, j-1, memo));
    }

    public boolean isValidPalindromeOptimized(String s, int k) {
        int memo[][] = new int[s.length()][s.length()];

        // Generate all combinations of `i` and `j` in the correct order.
        for (int i = s.length() - 2; i >= 0; i--)
            for (int j = i + 1; j < s.length(); j++) {
                // Case 1: Character at `i` equals character at `j`
                if (s.charAt(i) == s.charAt(j))
                    memo[i][j] = memo[i + 1][j - 1];

                // Case 2: Character at `i` does not equal character at `j`.
                // Either delete character at `i` or delete character at `j`
                // and try to match the two pointers using recursion.
                // We need to take the minimum of the two results and add 1
                // representing the cost of deletion.
                else
                    memo[i][j] = 1 + Math.min(memo[i + 1][j], memo[i][j - 1]);
            }

        // Return true if the minimum cost to create a palindrome by only deleting the letters
        // is less than or equal to `k`.
        return memo[0][s.length() - 1] <= k;
    }

}
