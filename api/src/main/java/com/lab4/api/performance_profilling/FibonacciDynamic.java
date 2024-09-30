package com.lab4.api.performance_profilling;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
    private static final Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {

            return memo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 8000;
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);

    } 
}
