package com.CK;

public class Main {
    public static void main(String[] args) {
        int result = new Solution().myAtoi("+-1");
        //System.out.println("1".charAt(0) < '9');
        //System.out.println(Integer.valueOf(String.valueOf(Integer.MAX_VALUE)));
        System.out.println(result);
    }
}

class Solution {
    public int myAtoi(String str) {
        int result = 0;
        int i = 0;
        String resultStr = "";
        String trimedStr = str.trim();
        if (trimedStr.length() > 0) {
            if (trimedStr.charAt(i) == '+' || trimedStr.charAt(i) == '-' || (trimedStr.charAt(i) >= '0' && trimedStr.charAt(i) <= '9')) {
                if (trimedStr.length() == 1 && trimedStr.charAt(i) >= '0' && trimedStr.charAt(i) <= '9') {
                    resultStr = trimedStr;
                } else {
                    for (int j = i + 1; j < trimedStr.length(); j++) {
                        if (trimedStr.charAt(j) < '0' || trimedStr.charAt(j) > '9') {
                            resultStr = trimedStr.substring(i, j);
                            j = trimedStr.length();
                        } else if (j == trimedStr.length() - 1) {
                            resultStr = trimedStr.substring(i, j + 1);
                        }
                    }
                }
            }
        } else {
            resultStr = trimedStr;
        }
        try {
            return result = Integer.valueOf(resultStr);
        } catch (NumberFormatException err) {
            if (resultStr.length() > 1 && resultStr.charAt(0) == '-') {
                return result = Integer.MIN_VALUE;
            } else if (resultStr.length() > 1) {
                return result = Integer.MAX_VALUE;
            } else {
                return result;
            }
        }
    }
}