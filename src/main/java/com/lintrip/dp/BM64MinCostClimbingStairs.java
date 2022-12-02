package com.lintrip.dp;

/**
 * @author gyt
 * @date 2022/12/2 11:45
 */
public class BM64MinCostClimbingStairs {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可 cost[n] = Math.min(cost[n-1] + cost[n],cost[n-2] + cost[n] );
     *
     * @param cost int整型一维数组
     * @return int整型
     */
    public int minCostClimbingStairs(int[] cost) {
        int dp1 = cost[0];
        int dp2 = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int temp = dp2;
            dp2 = Math.min(dp1 + cost[i], dp2 + cost[i]);
            dp1 = temp;
        }
        return Math.min(dp1, dp2);
    }
}
