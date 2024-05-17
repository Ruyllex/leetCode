import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Divisible and Non-divisible Sums Difference
 
You are given positive integers n and m.

Define two integers, num1 and num2, as follows:

    num1: The sum of all integers in the range [1, n] that are not divisible by m.
    num2: The sum of all integers in the range [1, n] that are divisible by m.

Return the integer num1 - num2.
*/


public class $2894{
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for(int i = 1; i != n + 1;i++){
            if(i % m != 0){
                num1 += i;
            }
            else{
                num2 += i;
            }
        }
        return num1 - num2;
    }
    @Test
    public void testDifferenceOfSums(){
        int n = 10;
        int m = 3;
        int ans = 19;
        assertEquals(ans, differenceOfSums(n, m));
    } 
    @Test
    public void testDifferenceOfSums2(){
        int n = 5;
        int m = 6;
        int ans = 15;
        assertEquals(ans, differenceOfSums(n, m));
    } 
    @Test
    public void testDifferenceOfSums3(){
        int n = 5;
        int m = 1;
        int ans = -15;
        assertEquals(ans, differenceOfSums(n, m));
    } 
}
