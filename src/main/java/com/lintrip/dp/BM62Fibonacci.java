package com.lintrip.dp;

/**
 * @author gyt
 * @date 2022/12/2 11:31
 */
public class BM62Fibonacci {
    public int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
