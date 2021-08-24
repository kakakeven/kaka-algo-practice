package com.lintrip.string;

/**
 * @author kakakeven
 * @date 2021/8/24 11:28
 */
public class BigNumberSum {

    public String solution(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        int length1 = charArray1.length;
        int length2 = charArray2.length;
        StringBuilder result = new StringBuilder();
        int n = 0;
        while (length1 > 0 || length2 > 0) {
            int sum;
            int a1 = 0;
            int a2 = 0;
            if (length1 > 0) {
                char c1 = charArray1[length1 - 1];
                a1 =  charToNum(c1);
                length1--;
            }
            if (length2 > 0) {
                char c2 = charArray2[length1 - 1];
                a2 = charToNum(c2);;
                length2--;
            }
            sum = a1 + a2 + n;
            n = sum / 10;
            int v = sum % 10;
            result.append(numToChar(v));
        }
        if (n > 0) {
            result.append(n);
        }
        return result.reverse().toString();
    }

    private char numToChar(int num){
        return (char) (num + '0');
    }

    private int charToNum(char ch){
        return ch - '0';
    }

}
