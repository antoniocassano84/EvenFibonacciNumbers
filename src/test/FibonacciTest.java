package test;

import com.company.Fibonacci;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


class FibonacciTest {

    @Test
    void testFibonacciRecursiveFirstFourValues() {
        int[][] testCases = { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 } };
        for(int[] testCase : testCases) {
            Assert.assertEquals(testCase[1], Fibonacci.fibonacci_recursive(testCase[0]));
        }
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testIllegalArgumentException() throws IllegalArgumentException {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Negative numbers not valid");
        Fibonacci.fibonacci_recursive(-1);
    }
}