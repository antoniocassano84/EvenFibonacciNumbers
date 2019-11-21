package test;

import com.company.Fibonacci;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class FibonacciTest {

    @Test
    void testFibonacciRecursiveFirstTwoValues() {
        int[][] testCases = { { 0, 0 }, { 1, 1 } };
        for(int[] testCase : testCases) {
            Assert.assertEquals(testCase[1], Fibonacci.fibonacci_recursive(testCase[0]));
        }
    }
}