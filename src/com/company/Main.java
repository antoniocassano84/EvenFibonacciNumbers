package com.company;

public class Main {

    private static long fibonacci_recursive(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
        }
    }
    public static void main(String[] args) {
            int i = 1;
            int sum = 0;
            long nextFib;

            long preTime=System.currentTimeMillis();
            do {
                nextFib = fibonacci_recursive(i);
                if(nextFib % 2 == 0){
                    sum += nextFib;
                }
                i++;
            } while(nextFib < 4_000_000);
            long postTime=System.currentTimeMillis();
            System.out.println("Sum is " + sum);
            System.out.println("Computation Time (milliseconds) for fibonacci_recursive: "+(postTime-preTime));
        }
    }
