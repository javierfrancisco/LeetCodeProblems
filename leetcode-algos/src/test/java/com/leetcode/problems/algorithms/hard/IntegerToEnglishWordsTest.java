package com.leetcode.problems.algorithms.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToEnglishWordsTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIntegerToEnglishWords()
    {
        int input = 1;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One", result);
    }

    @Test
    public void testIntegerToEnglishWords12()
    {
        int input = 12;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("Twelve", result);
    }

    @Test
    public void testIntegerToEnglishWords123()
    {
        int input = 123;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One Hundred Twenty Three", result);
    }

    @Test
    public void testIntegerToEnglishWords300()
    {
        int input = 300;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("Three Hundred", result);
    }

    @Test
    public void testIntegerToEnglishWords345()
    {
        int input = 345;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("Three Hundred", result);
    }

    @Test
    public void testIntegerToEnglishWords999()
    {
        int input = 999;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("Nine Hundred Ninety Nine", result);
    }

    @Test
    public void testIntegerToEnglishWords1000()
    {
        int input = 1000;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One Thousand", result);
    }

    @Test
    public void testIntegerToEnglishWords9999()
    {
        int input = 9999;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("Nine Thousand Nine Hundred Ninety Nine", result);
    }


    @Test
    public void testIntegerToEnglishWords1234567()
    {
        int input = 1234567;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", result);
    }

    @Test
    public void testIntegerToEnglishWords1234567891()
    {
        int input = 1234567891;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One", result);
    }

    @Test
    public void testIntegerToEnglishWords0()
    {
        int input = 0;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("Zero", result);
    }

    @Test
    public void testIntegerToEnglishWords100()
    {
        int input = 100;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One Hundred", result);
    }

    @Test
    public void testIntegerToEnglishWords1000000()
    {
        int input = 1000000;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One Million", result);
    }

    @Test
    public void testIntegerToEnglishWords1000010()
    {
        int input = 1000010;
        String result = IntegerToEnglishWords.numberToWords(input);
        assertEquals("One Million Ten", result);
    }
}
