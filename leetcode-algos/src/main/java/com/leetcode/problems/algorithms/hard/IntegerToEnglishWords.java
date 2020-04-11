package com.leetcode.problems.algorithms.hard;


import java.util.*;

/**
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.
 *
 * Example 1:
 *
 * Input: 123
 * Output: "One Hundred Twenty Three"
 * Example 2:
 *
 * Input: 12345
 * Output: "Twelve Thousand Three Hundred Forty Five"
 * Example 3:
 *
 * Input: 1234567
 * Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 * Example 4:
 *
 * Input: 1234567891
 * Output: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"
 */
public class IntegerToEnglishWords {

    private static Map<Integer,String> KEYWORDS_MAP = new HashMap<>();
    static {
            KEYWORDS_MAP.put(1, "One");
            KEYWORDS_MAP.put(2, "Two");
            KEYWORDS_MAP.put(3, "Three");
            KEYWORDS_MAP.put(4, "Four");
            KEYWORDS_MAP.put(5, "Five");
            KEYWORDS_MAP.put(6, "Six");
            KEYWORDS_MAP.put(7, "Seven");
            KEYWORDS_MAP.put(8, "Eight");
            KEYWORDS_MAP.put(9, "Nine");
            KEYWORDS_MAP.put(10, "Ten");
            //
            KEYWORDS_MAP.put(11, "Eleven");
            KEYWORDS_MAP.put(12, "Twelve");
            KEYWORDS_MAP.put(13, "Thirteen");
            KEYWORDS_MAP.put(14, "Fourteen");
            KEYWORDS_MAP.put(15, "Fifteen");
            KEYWORDS_MAP.put(16, "Sixteen");
            KEYWORDS_MAP.put(17, "Seventeen");
            KEYWORDS_MAP.put(18, "Eighteen");
            KEYWORDS_MAP.put(19, "Nineteen");
            //
            KEYWORDS_MAP.put(20, "Twenty");
            KEYWORDS_MAP.put(30, "Thirty");
            KEYWORDS_MAP.put(40, "Forty");
            KEYWORDS_MAP.put(50, "Fifty");
            KEYWORDS_MAP.put(60, "Sixty");
            KEYWORDS_MAP.put(70, "Seventy");
            KEYWORDS_MAP.put(80, "Eighty");
            KEYWORDS_MAP.put(90, "Ninety");
            //
            KEYWORDS_MAP.put(100, "Hundred");
            KEYWORDS_MAP.put(1000, "Thousand");
            KEYWORDS_MAP.put(1000000, "Million");
            KEYWORDS_MAP.put(10000000, "Billion");
        };

    public static String numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        String number = Integer.toString(num);
        char[] numberArr = number.toCharArray();
        int n = numberArr.length;
        int chunk = 3;

        List<char[]> chunkList = new ArrayList<>();
        for (int i = n; i > 0; i-=chunk) {
            chunkList.add(Arrays.copyOfRange(numberArr, Math.max(0, i - chunk), i));
        }
        int chunksSize = chunkList.size();
        StringBuilder result = new StringBuilder();
        for (int i = chunksSize - 1; i >= 0; i--) {

            String convertedChunk = convertChunk(chunkList.get(i));
            if (!"".equals(convertedChunk)) {
                result.append(" ").append(convertedChunk);
            }
            if (i == 1 && !"".equals(convertedChunk)) {
                result.append(" ").append(KEYWORDS_MAP.get(1000));
            } else if (i == 2 && !"".equals(convertedChunk)) {
                result.append(" ").append(KEYWORDS_MAP.get(1000000));
            } else if (i == 3 && !"".equals(convertedChunk)) {
                result.append(" ").append(KEYWORDS_MAP.get(10000000));
            }
        }
        return result.toString().trim();
    }

    private static String convertChunk(char[] chunk) {

        StringBuilder res = new StringBuilder();
        String chunkString = new String(chunk);
        int chunkValue = Integer.parseInt(chunkString);

        while (chunkValue > 0) {

            if (chunkValue >= 100) {
                int hundreds = chunkValue / 100;
                chunkValue -= hundreds * 100;

                if (KEYWORDS_MAP.containsKey(hundreds)) {
                    res.append(KEYWORDS_MAP.get(hundreds));
                }
                if (KEYWORDS_MAP.containsKey(100)) {
                    res.append(" ").append(KEYWORDS_MAP.get(100));
                }
            } else if (chunkValue < 20) {
                res.append(" ").append(KEYWORDS_MAP.get(chunkValue));
                chunkValue -= chunkValue;
            } else if (chunkValue >= 20) {
                int tenths = chunkValue / 10;
                int tenthsValue = tenths * 10;
                chunkValue -= tenthsValue;
                res.append(" ").append(KEYWORDS_MAP.get(tenthsValue));
            }
        }

        return  res.toString().trim();
    }

}
