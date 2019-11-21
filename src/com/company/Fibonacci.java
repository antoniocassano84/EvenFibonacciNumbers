package com.company;

public class Fibonacci {

    public static long fibonacci_recursive(long n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
        }
    }
}
