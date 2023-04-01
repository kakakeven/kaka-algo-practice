package com.lintrip.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gyt
 * @date 2022/12/28 21:09
 */
public class BM65LCSTest {

    BM65LCS bM65LCS = new BM65LCS();

    @Test
    public void testLCS() throws Exception {
        String result = bM65LCS.LCS("1A2C3D4B56", "B1D23A456A");
        System.out.println(result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme