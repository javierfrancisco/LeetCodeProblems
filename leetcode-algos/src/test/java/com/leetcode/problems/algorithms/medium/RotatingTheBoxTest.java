package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class RotatingTheBoxTest
{
    /**
     *  Input: nums = [2,7,9,3,1]
     *  Output: 12
     */
    @Test
    public void testHouseRobbert()
    {

        /**
         * A stone '#'
         * A stationary obstacle '*'
         * Empty '.'
         */
        char[][] box = new char[][] {{'#','.','#'}};

        char[][] box2 = new char[][] {{'#','.','#'}, {'#','.','.'}, {'.','#','.'}};

        char[][] box3 = new char[][] {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};


        RotatingTheBox rotatingTheBox = new RotatingTheBox();
        //char[][] result = RotatingTheBox.rotateTheBox(box);
        //assertEquals( 12, result);

        char[][] boxCopyResult = rotatingTheBox.printTheBox(box2);
        System.out.println("Transpose:");
        char[][] boxCopyResult2  = rotatingTheBox.transpose(box2);
        rotatingTheBox.printTheBox(boxCopyResult2);
        System.out.println("Reflect:");
        rotatingTheBox.reflect(boxCopyResult2);
        rotatingTheBox.printTheBox(boxCopyResult2);
        System.out.println("Apply Gravity:");
        rotatingTheBox.applyGravity(boxCopyResult2);

        rotatingTheBox.printTheBox(boxCopyResult2);
        //rotatingTheBox.printTheBox(boxCopyResult);
    }

}
