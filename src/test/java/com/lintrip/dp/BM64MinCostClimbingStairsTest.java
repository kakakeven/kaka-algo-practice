package com.lintrip.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gyt
 * @date 2022/12/2 15:01
 */
public class BM64MinCostClimbingStairsTest {

    BM64MinCostClimbingStairs bM64MinCostClimbingStairs = new BM64MinCostClimbingStairs();

    @Test
    public void testMinCostClimbingStairs() throws Exception {
        int result = bM64MinCostClimbingStairs.minCostClimbingStairs(new int[]{0});
        Assert.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme