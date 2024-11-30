import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
/*
Happy Number

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:
    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*/

public class $202 {
    public static int calculateSum(String number){
        int aux = 0;
        int total = 0;
        for(int i = 0; i != number.length(); i++){
            aux = number.charAt(i) - '0';            
            total = total + aux*aux;
        }
            return total;
    }
    public static boolean isHappy(int n) {
        String number = String.valueOf(n);
        String current = String.valueOf(calculateSum(number));
        while(!current.equals("1") || !current.contains("1")){
            current = String.valueOf(calculateSum(current));
        }
        if(!current.equals("1")){
            return false;
        }
        return true;
    }
    @Test
    public void testIShappy(){
        int n = 19;
        assertTrue($202.isHappy(n));
    }
    @Test
    public void testIShappy2(){
        int n = 2;
        assertFalse($202.isHappy(n));
    }
    
}
