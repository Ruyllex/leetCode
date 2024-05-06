import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Split a String in Balanced Strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
    Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
*/

public class $1221{
    public static int balancedStringSplit(String s) {
        int auxR = 0;
        int auxL = 0;
        int ans = 0;
        for(int i = 0; i != s.length();i++){
            if(s.charAt(i) == 'R'){
                auxR++;
                if(auxL != 0 && auxR == auxL ){
                    ans++;
                }
            }
            if(s.charAt(i) == 'L'){
                auxL++;
                if(auxL != 0 && auxR == auxL ){
                    ans++;
                }

            }
        }
        return ans;
    }
    @Test
    public void testBalancedString(){
        String s = "RLRRLLRLRL";
        int ans = 4;
        assertEquals(ans, $1221.balancedStringSplit(s));
    }
    @Test
    public void testBalancedString2(){
        String s = "RLRRRLLRLL";
        int ans = 2;
        assertEquals(ans, $1221.balancedStringSplit(s));
    }
    @Test
    public void testBalancedString3(){
        String s = "LLLLRRRR";
        int ans = 1;
        assertEquals(ans, $1221.balancedStringSplit(s));
    }
}