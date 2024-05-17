import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Subtract the Product and Sum of Digits of an Integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits. 
*/
public class $1281 {
    public static int subtractProductAndSum(int n) {
        String x = String.valueOf(n);
        int sum = 0;
        int mult = 1;
        for(int i = 0; i != x.length();i++){
            sum += Character.getNumericValue(x.charAt(i));
        }
        for(int i = 0; i != x.length();i++){
            mult *= Character.getNumericValue(x.charAt(i));
        }
        return mult - sum;
    }
    @Test
    public void testSubtractProductAndSum(){
        int n = 234;
        int ans = 15;
        assertEquals(ans, $1281.subtractProductAndSum(n));
    }    
}
