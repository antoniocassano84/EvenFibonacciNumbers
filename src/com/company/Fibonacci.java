package com.company;

class Fibonacci {

    static long fibonacci_recursive(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
        }
    }
}
