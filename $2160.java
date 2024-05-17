import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

/*
Minimum Sum of Four Digit Number After Splitting Digits

You are given a positive integer num consisting of exactly four digits. 
Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, 
and all the digits found in num must be used.

    For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. 
    Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].

Return the minimum possible sum of new1 and new2.
*/



public class $2160 {
    public static int minimumSum(int num) {
        String numbers = String.valueOf(num);
        String[] numArray = numbers.split("");
        int[] numInt = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            numInt[i] = Integer.parseInt(numArray[i]);
        }
        Arrays.sort(numInt);
        StringBuilder sb = new StringBuilder();
        for (int x : numInt) {
            sb.append(x);
        }
        String aux = sb.toString();
        String new1 = "";
        String new2 = "";
        for(int j = 0; j != aux.length();j++){
            if(j % 2 == 0){
                new1 += aux.charAt(j);
            }
            else{
                new2 += aux.charAt(j);
            }
        }
        return Integer.parseInt(new1) + Integer.parseInt(new2);
    }
    @Test
    public void testMinimumSum(){
        int num = 2932;
        int ans = 52;
        assertEquals(ans, $2160.minimumSum(num));
    }
    @Test
    public void testMinimumSum2(){
        int num = 4009;
        int ans = 13;
        assertEquals(ans, $2160.minimumSum(num));
    }

}
