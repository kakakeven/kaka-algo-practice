package com.lintrip.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author kakakeven
 * @date 2021/8/24 11:29
 */
public class BigNumberSumTest {


    @Test
    public void test() {
        String s1 = "1268";
        String s2 = "234";
        BigNumberSum solution = new BigNumberSum();
        String result = solution.solution(s1, s2);
        Assert.assertEquals("1502", result);
    }
}
