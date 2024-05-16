import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Find the Maximum Achievable Number


You are given two integers, num and t.
An integer x is called achievable if it can become equal to num after applying the following operation no more than t times:
Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
Return the maximum possible achievable number. It can be proven that there exists at least one achievable number. 
*/

public class $2769 {
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2*t;
    }
    @Test
    public void testTheMaximumAchivableX(){
        int num = 4;
        int t = 1;
        int ans = 6;
        assertEquals(ans, $2769.theMaximumAchievableX(num, t));
    }
    @Test
    public void testTheMaximumAchivableX2(){
        int num = 3;
        int t = 2;
        int ans = 7;
        assertEquals(ans, $2769.theMaximumAchievableX(num, t));
    }
}
