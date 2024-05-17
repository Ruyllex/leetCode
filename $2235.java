
/*
Add Two Integers

Given two integers num1 and num2, return the sum of the two integers. 
*/

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class $2235 {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }
        else{
            return n*2;
        }
    }
    @Test
    public void testSmallestEvenMultiple(){
        int n = 5;
        int ans = 10;
        assertEquals(ans, smallestEvenMultiple(n));
    }
    @Test
    public void testSmallestEvenMultiple2(){
        int n = 6;
        int ans = 6;
        assertEquals(ans, smallestEvenMultiple(n));
    }
}

