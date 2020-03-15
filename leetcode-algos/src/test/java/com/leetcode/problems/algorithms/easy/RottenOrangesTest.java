package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class RottenOrangesTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testRottenOranges()
    {

        /*
        //List to Array conversion and vice-versa
        List<List<Integer>> inputList = new ArrayList<>();
        List<Integer> row1 = Arrays.stream(new int[]{2,1,1}).boxed().collect(Collectors.toList());
        List<Integer> row2 = Arrays.stream(new int[]{1,1,0}).boxed().collect(Collectors.toList());
        List<Integer> row3 = Arrays.stream(new int[]{0,1,1}).boxed().collect(Collectors.toList());
        inputList.add(row1);
        inputList.add(row2);
        inputList.add(row3);

        int[] array = row1.stream().mapToInt(i->i).toArray();

        int[][] array2d = inputList.stream()
                .map(l -> l.stream().mapToInt(i->i).toArray())
                .toArray(int[][]::new);

         */
        int[][] input = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        int output = 4;
        RottenOranges rottenOranges = new RottenOranges();
        int result = rottenOranges.orangesRotting(input);

        assertEquals(output, result);
    }
}
