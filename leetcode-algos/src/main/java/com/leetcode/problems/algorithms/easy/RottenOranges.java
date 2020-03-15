package com.leetcode.problems.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * In a given grid, each cell can have one of three values:
 *
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 *
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * Example 2:
 *
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 * Example 3:
 *
 * Input: [[0,2]]
 * Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 *
 *
 * Note:
 *
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2.
 */
public class RottenOranges
{
    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        if (isGridSolved(grid, rows, cols)){
            return 0;
        }

        //Find all rotten oranges
        List<Node> queue = new ArrayList<>();
        for (int i =0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2)
                    queue.add(new Node(i, j));
            }
        }
        //Do Breadth First Search for all rotten oranges
        int minutes = 0;
        while(!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i ++) {
                Node current = queue.remove(0);
                List<Node> neighbors = getNeighbors(grid, current);
                queue.addAll(neighbors);
            }
            if (!queue.isEmpty())
                minutes++;
        }

        return isGridSolved(grid, rows, cols) ? minutes : -1;
    }

    public List<Node> getNeighbors(int[][] grid, Node node){

        List<Node> neighbors = new ArrayList<>();
        if (isValidPoint(grid, node.x, node.y - 1)) { //left
            grid[node.x][node.y - 1] = 2;
            neighbors.add(new Node(node.x, node.y - 1));
        }
        if (isValidPoint(grid, node.x, node.y + 1)) { //right
            grid[node.x][node.y + 1] = 2;
            neighbors.add(new Node(node.x, node.y + 1));
        }
        if (isValidPoint(grid, node.x - 1, node.y)) { //up
            grid[node.x - 1][node.y] = 2;
            neighbors.add(new Node(node.x - 1, node.y));
        }
        if (isValidPoint(grid, node.x + 1, node.y)) { //down
            grid[node.x + 1][node.y] = 2;
            neighbors.add(new Node(node.x + 1, node.y));
        }
        return neighbors;
    }

    public boolean isValidPoint(int[][] grid, int x, int y) {
        return  !(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length)
                && grid[x][y] == 1;
    }

    public static boolean isGridSolved(int[][] grid, int rows, int cols) {
        for (int i =0; i < rows; i++) {
            for(int j=0; j < cols; j++) {
                if (grid[i][j] == 1)
                    return false;
            }
        }
        return true;
    }

    class Node {
        int x;
        int y;
        public Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
