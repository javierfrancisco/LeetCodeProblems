package com.leetcode.problems.algorithms.medium;

import java.util.*;

/**
 * Number of Islands
 * 
 * Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water),
 *  return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 *  You may assume all four edges of the grid are all surrounded by water.

 
Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++ ) {
                if (grid[i][j] == '1') {
                    result++;
                    bfs(grid, i, j);
                }
            }
        }
        return result;
    }

    public void bfs(char[][] grid, int row, int col){

        int m = grid.length;
        int n = grid[0].length;
        //Create a list of possible directions
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        //Create a queue with input and use queue to traverse BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            //Iterate each direction
            for (int[] direction: directions) {
                int newRow = current[0] + direction[0];
                int newCol = current[1] + direction[1];

                //If position is land (1) then add to queue for traversal and make the land under water (0)
                if (0 <= newRow && 0 <= newCol && newRow < m && newCol < n && grid[newRow][newCol] == '1') {
                    grid[newRow][newCol] = 0;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }
}
