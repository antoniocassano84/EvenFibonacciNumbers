package test;

import com.company.Fibonacci;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class FibonacciTest {

    @Test
    void testFibonacciRecursive() {
        Assert.assertEquals(0, Fibonacci.fibonacci_recursive(0));
    }
}