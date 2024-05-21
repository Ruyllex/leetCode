import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
Count Asterisks
 
You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, 
the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

Return the number of '*' in s, excluding the '*' between each pair of '|'.

Note that each '|' will belong to exactly one pair.
*/

public class $2315  {
    public static int countAsterisks(String s) {
        int count = 0;
        int aux = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                aux++;
            } 
            else if (s.charAt(i) == '*' && aux % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    @Test
    public void testCountAsterisks(){
        String s = "l|*e*et|c**o|*de|";
        int ans = 2;
        assertEquals(ans, $2315.countAsterisks(s)); 
    }
    @Test
    public void testCountAsterisks2(){
        String s = "iamprogrammer";
        int ans = 0;
        assertEquals(ans, $2315.countAsterisks(s)); 
    }
    @Test
    public void testCountAsterisks3(){
        String s = "yo|uar|e**|b|e***au|tifu|l";
        int ans = 5;
        assertEquals(ans, $2315.countAsterisks(s)); 
    }
}
