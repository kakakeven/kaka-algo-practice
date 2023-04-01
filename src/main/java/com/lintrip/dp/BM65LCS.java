package com.lintrip.dp;

/**
 * @author gyt
 * @date 2022/12/28 21:03
 */
public class BM65LCS {

    /**
     * longest common subsequence
     *
     * @param s1 string字符串 the string
     * @param s2 string字符串 the string
     * @return string字符串
     */
    public String LCS(String s1, String s2) {
        // write code here
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];
        StringBuilder res = new StringBuilder();

        //动态规划找到最长公共子序列
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else{
                    if(s1.charAt(i) == s2.charAt(j))
                        dp[i][j] = dp[i-1][j-1] + 1;
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int i = m-1, j = n-1;
        while(i >= 0 && j >= 0){
            if(s1.charAt(i) == s2.charAt(j)){
                res.append(s1.charAt(i));
                i--;
                j--;
            }
            if(i>0 && j>0 && s1.charAt(i) != s2.charAt(j)){
                if(dp[i-1][j] > dp[i][j-1])
                    i--;
                else
                    j--;
                //dp[i-1][j] < dp[i][j-1]时,j--;
                //dp[i-1][j] = dp[i][j-1]时,i--或j--,这里统一为j--;
            }

            //行或列到达边界
            if(i==0)j--;
            if(j==0)i--;
        }

        if(res.toString().equals("") || res==null)return "-1";
        return res.reverse().toString();
    }
}
