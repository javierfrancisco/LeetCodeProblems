package com.leetcode.problems.algorithms.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 346. Moving Average from Data Stream
Easy
Topics
Companies
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Implement the MovingAverage class:

MovingAverage(int size) Initializes the object with the size of the window size.
double next(int val) Returns the moving average of the last size values of the stream.
 

Example 1:

Input
["MovingAverage", "next", "next", "next", "next"]
[[3], [1], [10], [3], [5]]
Output
[null, 1.0, 5.5, 4.66667, 6.0]

Explanation
MovingAverage movingAverage = new MovingAverage(3);
movingAverage.next(1); // return 1.0 = 1 / 1
movingAverage.next(10); // return 5.5 = (1 + 10) / 2
movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3
 

Constraints:

1 <= size <= 1000
-105 <= val <= 105
At most 104 calls will be made to next.
 */
public class MovingAverageDataStream {

    private int size = 0;
    private double windowSum = 0;
    private Deque<Integer> queue = new ArrayDeque<>();
    public MovingAverageDataStream(int size) {
        //Idea create a FIFO queue of size 'size'
        //keep a variable with the value of the moving avg window
        //when adding (next), substract the queue head value from moving avg window val
        //and increase by val, for queue removeFirst and addLast(value)
        this.size = size;
    }
    
    public double next(int val) {
        
        queue.add(val);
        if (queue.size() <= size) {
            windowSum = windowSum + val;
        } else {
            Integer head = queue.removeFirst();
            windowSum = windowSum - head + val;
        }
        return (double) windowSum / queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

