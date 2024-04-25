import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
N-th Tribonacci Number

The Tribonacci sequence Tn is defined as follows: 
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.
*/
public class $1137 {
    /*
     * -----------------------recursive way----------------------------
     * public static int tribonacci(int n) {
     * if (n == 0)
     * return 0;
     * if (n == 1 || n == 2)
     * return 1;
     * return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
     * }
     */
    public static int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int[] trib = new int[n + 1];
        trib[0] = 0;
        trib[1] = 1;
        trib[2] = 1;
        for (int i = 3; i <= n; i++) {
            trib[i] = trib[i - 1] + trib[i - 2] + trib[i - 3];
        }
        return trib[n];
    }

    @Test
    public void testTribonacci() {
        int n = 4;
        int ans = 4;
        assertEquals(ans, $1137.tribonacci(n));
    }

    @Test
    public void testTribonacci2() {
        int n = 25;
        int ans = 1389537;
        assertEquals(ans, $1137.tribonacci(n));
    }

    @Test
    public void testTribonacci3() {
        int n = 35;
        int ans = 615693474;
        assertEquals(ans, $1137.tribonacci(n));
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$1470");
    }
}
