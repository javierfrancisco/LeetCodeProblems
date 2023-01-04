package com.leetcode.problems.algorithms.medium;

import java.util.*;

/**
 * You are given an m x n matrix of characters box representing a side-view of a box. Each cell of the box is one of the following:
 *
 * A stone '#'
 * A stationary obstacle '*'
 * Empty '.'
 * The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.
 *
 * It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.
 *
 * Return an n x m matrix representing the box after the rotation described above.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: box = [["#",".","#"]]
 * Output: [["."],
 *          ["#"],
 *          ["#"]]
 * Example 2:
 *
 *
 *
 * Input: box = [["#",".","*","."],
 *               ["#","#","*","."]]
 * Output: [["#","."],
 *          ["#","#"],
 *          ["*","*"],
 *          [".","."]]
 * Example 3:
 *
 *
 *
 * Input: box = [["#","#","*",".","*","."],
 *               ["#","#","#","*",".","."],
 *               ["#","#","#",".","#","."]]
 * Output: [[".","#","#"],
 *          [".","#","#"],
 *          ["#","#","*"],
 *          ["#","*","."],
 *          ["#",".","*"],
 *          ["#",".","."]]
 *
 *
 * Constraints:
 *
 * m == box.length
 * n == box[i].length
 * 1 <= m, n <= 500
 * box[i][j] is either '#', '*', or '.'.
 */
public class RotatingTheBox {

    public static char[][] transpose(char[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        char[][] transpose = new char[m][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                transpose[col][row] = matrix[row][col];
            }
        }
        return transpose;
    }

    public static void reflect(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m / 2; col++) {
                char temp = matrix[row][col];
                matrix[row][col] = matrix[row][m - col - 1];
                matrix[row][m - col - 1] = temp;
            }
        }
    }

    public static void applyGravity(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int row = n - 1; row >= 0; row--) {
            for (int col = 0; col < m; col++) {
                char currentChar = matrix[row][col];

                if (currentChar == '#') {
                    int tempRow = row;
                    while(isDownValid(matrix, tempRow, col)) {
                        matrix[tempRow][col] = '.';
                        matrix[tempRow + 1][col] = '#';
                        tempRow++;
                    }
                }
            }
        }
    }

    public static boolean isDownValid(char[][] matrix, int row, int col) {
        return row + 1 >= matrix.length ? false : matrix[row + 1][col] == '.';
    }

    public static char[][] rotateTheBox(char[][] box) {
        char[][] transpose  = transpose(box);
        reflect(transpose);
        applyGravity(transpose);
        return transpose;
    }

    public static char[][] printTheBox(char[][] box) {

        int m = box[0].length;
        int n = box.length;

        //char[][] boxCopy = new char[m][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                char currentChar = box[row][col];
                //boxCopy[row][col] = currentChar;
                System.out.print(currentChar);
            }
            System.out.println(" ");
        }
        //return boxCopy;
        return box;
    }

}
