import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.lang.Math;

/*
Score of a String

You are given a string s. The score of a string is defined 
as the sum of the absolute difference between the ASCII values of adjacent characters.
Return the score of s.
*/

public class $3110  {
    public static int scoreOfString(String s) {
        int ans = 0;
        for(int i = 0; i != (s.length() - 1); i++){
            ans += Math.abs((int)(s.charAt(i)) - (int)(s.charAt(i + 1)));
        }
        return ans;
    }
    @Test
    public void testScoreOfString(){
        String s = "hello";
        int ans = 13;
        assertEquals(ans,$3110.scoreOfString(s));
    }
    @Test
    public void testScoreOfString2(){
        String s = "zaz";
        int ans = 50;
        assertEquals(ans, $3110.scoreOfString(s));
    }

}
