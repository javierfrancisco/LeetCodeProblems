package com.leetcode.problems.algorithms.medium;

import java.util.Arrays;

/**
 * Cafeteria: 
 * No two diners are sitting in the same seat, and the social distancing guidelines are satisfied.
Determine the maximum number of additional diners who can potentially sit at the table without social distancing guidelines being violated for any new or existing diners, assuming that the existing diners cannot move and that the additional diners will cooperate to maximize how many of them can sit down.
Please take care to write a solution which runs within the time limit.
Constraints
 */
public class Cafeteria {

    public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
        // Write your code here
        // Sort the taken seats, then iterate in order, so we know first range is between
        // First firstAvailableSeath and the taken seat, then we use our formula,
        // to calculate how many possible taken seats in range, we move pointer to right after social distancing
        // then calculate last segment
        // till the end of array using same formula for possible taken sears
        
        Arrays.sort(S);
        int s = S.length;
        long firstAvailableSeat = 1;
        long result = 0; 
        long seatSpace = 0;
        
        for (int i =0; i < s; i++) {
          seatSpace = S[i] - K - firstAvailableSeat;
          if (seatSpace > 0) {
            result += Math.ceil((double)seatSpace / (double)(K + 1));
          }
          firstAvailableSeat = S[i] + K + 1;
        }
        seatSpace = N - firstAvailableSeat + 1;
        if (seatSpace > 0) {
          result += Math.ceil((double)seatSpace / (double)(K + 1));
        }
        return result;
      }
    
}
