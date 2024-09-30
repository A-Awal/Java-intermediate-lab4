package com.lab4.api.performance_profilling;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static double fibonacci_nonRecursive(int n) {
        double prev=0d, next=1d, result=0d;
        for (int i = 0; i < n; i++) {
            result=prev+next;
            prev=next;
            next=result;
        }
        return result;
    }


    public static void main(String[] args) {
        int n = 100; 

        int result = fibonacci(n);
        // var result = fibonacci_nonRecursive(n);
        System.out.println("Fibonacci(" + n + ") = " + result);

    }
}
