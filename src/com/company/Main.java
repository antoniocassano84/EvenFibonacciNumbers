package com.company;

public class Main {

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
            int i = 1;
            int sum = 0;
            int nextFib;
            do {
                nextFib = Main.fibonacci(i);
                //System.out.println(nextFib);
                if(nextFib % 2 == 0){
                    sum += nextFib;
                }
                i++;
            } while(nextFib < 4000000);

            System.out.println("Sum is " + sum);
        }
    }
