package com.leetcode.problems.algorithms.medium;

/**
 * Given an absolute path for a file (Unix-style), simplify it. Or in other words, convert it to the canonical path.
 *
 * In a UNIX-style file system, a period . refers to the current directory. Furthermore, a double period .. moves the directory up a level.
 *
 * Note that the returned canonical path must always begin with a slash /, and there must be only a single slash / between two directory names. The last directory name (if it exists) must not end with a trailing /. Also, the canonical path must be the shortest string representing the absolute path.
 *
 *
 *
 * Example 1:
 *
 * Input: "/home/"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last directory name.
 * Example 2:
 *
 * Input: "/../"
 * Output: "/"
 * Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
 * Example 3:
 *
 * Input: "/home//foo/"
 * Output: "/home/foo"
 * Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 * Example 4:
 *
 * Input: "/a/./b/../../c/"
 * Output: "/c"
 * Example 5:
 *
 * Input: "/a/../../b/../c//.//"
 * Output: "/c"
 * Example 6:
 *
 * Input: "/a//b////c/d//././/.."
 * Output: "/a/b/c"
 */
public class SimplifyPath {


    /**
     * Details
     * Runtime: 2 ms, faster than 99.77% of Java online submissions for Simplify Path.
     * Memory Usage: 39.8 MB, less than 6.67% of Java online submissions for Simplify Path.
     * Next challenges:
     * Online Stock Span
     * Search Suggestions System
     * Increasing Decreasing String
     * 
     * @param path
     * @return
     */
    public  String simplifyPath(String path) {
        int n = path.length();

        StringBuilder value = new StringBuilder();
        //There can be max n/2 tokens
        String[] pathsArray = new String[n/2];
        int pointer = 0;
        for (int i = 0; i < n; i++) {
            char current = path.charAt(i);
            if (current == '/') {
                String valueString = value.toString();
                if ("..".equals(valueString)) {
                    //move up to parent directory
                    pointer = Math.max(0, pointer - 1);
                } else if (!valueString.isEmpty() && !".".equals(valueString)) {
                    //this is a valid path
                    pathsArray[pointer++] = valueString;
                }
                value = new StringBuilder();
                continue;
            }
            value.append(current);
        }

        //Checks last token
        if ("..".equals(value.toString())) {
            pointer = Math.max(0, pointer - 1);
        } else if (!value.toString().isEmpty() && !".".equals(value.toString())) {
            pathsArray[pointer++] = value.toString();
        }

        StringBuilder res = new StringBuilder();
        for (int j = 0; j < pointer; j++) {
            if (!pathsArray[j].isEmpty()) {
                res.append("/");
                res.append(pathsArray[j]);
            }
        }
        return res.toString().isEmpty() ? "/" : res.toString();
    }
    }
