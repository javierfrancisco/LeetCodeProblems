package com.leetcode.problems.algorithms.medium;

import java.util.Arrays;

/**
 * Note: Chapter 2 is a harder version of this puzzle. The only difference is a larger constraint on N.
A photography set consists of IN cells in a row, numbered from 1 to N in order, and can be represented by a string C of length N. Each cell i is one of the following types (indicated by Ci, the ith character of C):
• If Ci = "p",
, it is allowed to contain a photographer
• If C; = "A", it is allowed to contain an actor
• If Ci = "B", it is allowed to contain a backdrop
• If Ci="=", it must be left empty
A photograph consists of a photographer, an actor, and a backdrop, such that each of them is placed in a valid cell, and such that the actor is between the photographer and the backdrop. Such a photograph is considered artistic if the distance between the photographer and the actor is between X and Y cells (inclusive), and the distance between the actor and the backdrop is also between X and Y cells (inclusive). The distance between cells i and jis i - j (the absolute value of the difference between their indices).
Determine the number of different artistic photographs which could potentially be taken at the set. Two photographs are considered different if they involve a different photographer cell, actor cell, and/or backdrop cell.
 */
public class DirectorOfPhotography {

  private int bounded(int x, int N) {
    return Math.max(0, Math.min(x, N));
}

  public int getArtisticPhotographCount(int N, String C, int X, int Y) {
    // Write your code here

    // Create a nested loop for p (photographer), a (actor), and b (backdrop)
    // check following condtions:
    // get distance between p and a, get distance between a and b
    // distance should be on same direction
    // if the combination meets the distances then add to result
    int result = 0;
    for (int p = 0; p < N; p++) {
      for (int a = 0; a < N; a++) {
        for (int b = 0; b < N; b++) {
          int distance1 = Math.abs(p - a); 
          int distance2 = Math.abs(a - b);

          if ((p - a) * (a - b) > 0 
          && C.charAt(p) == 'P' && C.charAt(a) == 'A' && C.charAt(b) == 'B'
          &&  distance1 >= X && distance1 <= Y && distance2 >= X && distance2 <=Y) {
            result++;
          }
        }
      }
    }

    return result;
  }
  public int getArtisticPhotographCountOptimized(int N, String C, int X, int Y) {

    int[] prefixPSum = new int[C.length() + 1];
    int[] prefixBSum = new int[C.length() + 1];

    // Calculate prefix sums
    // Prefix sum for "P" characters
    int pSum = 0;
    for (int i = 0; i < C.length(); i++) {
        if (C.charAt(i) == 'P') {
            pSum++;
        }
        prefixPSum[i + 1] = pSum;
    }

    // Prefix sum for "B" characters
    int bSum = 0;
    for (int i = 0; i < C.length(); i++) {
        if (C.charAt(i) == 'B') {
            bSum++;
        }
        prefixBSum[i + 1] = bSum;
    }

    int result = 0;

    // Iterate through characters
    for (int i = 0; i < C.length(); i++) {
        char c = C.charAt(i);
        if (c == 'A') {
            // Define left and right windows
            int leftStart = bounded(i - Y, N);
            int leftEnd = bounded(i - X + 1, N);
            int rightStart = bounded(i + X, N);
            int rightEnd = bounded(i + Y + 1, N);

            // Calculate counts within windows using prefix sums
            int leftPs = prefixPSum[leftEnd] - prefixPSum[leftStart];
            int rightBs = prefixBSum[rightEnd] - prefixBSum[rightStart];
            result += leftPs * rightBs;

            int rightPs = prefixPSum[rightEnd] - prefixPSum[rightStart];
            int leftBs = prefixBSum[leftEnd] - prefixBSum[leftStart];
            result += leftBs * rightPs;
        }
    }
    return result;
  }
}
