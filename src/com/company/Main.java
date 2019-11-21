package com.company;

public class Main {


    public static void main(String[] args) {
            int i = 1;
            int sum = 0;
            long nextFib;

            long preTime=System.currentTimeMillis();
            do {
                nextFib = Fibonacci.fibonacci_recursive(i);
                if(nextFib % 2 == 0){
                    sum += nextFib;
                }
                i++;
            } while(nextFib < 4_000_000);
            long postTime=System.currentTimeMillis();
            
            System.out.println("Sum is " + sum);
            System.out.println("Computation Time (milliseconds) for fibonacci_recursive: " +
                    (postTime-preTime));
        }
    }
