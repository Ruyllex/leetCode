import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Fibonacci Number

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

Given n, calculate F(n).
*/
public class $509  {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; ++i) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    @Test
    public void testFib(){
        int n = 2;
        int ans = 1;
        assertEquals(ans, $509.fib(n));
    }
    @Test
    public void testFib2(){
        int n = 3;
        int ans = 2;
        assertEquals(ans, $509.fib(n));
    }
    @Test
    public void testFib3(){
        int n = 4;
        int ans = 3;
        assertEquals(ans, $509.fib(n));
    }
}
