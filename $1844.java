import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
Replace All Digits with Characters

You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.
There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

    For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.

For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).
Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.
*/

public class $1844 {
    public static char shift(char c, int shiftValue) {
        String dic = "abcdefghijklmnopqrstuvwxyz";
        int index = dic.indexOf(c);
        if (index == -1) {
            return c;  
        }
        int shiftedIndex = (index + shiftValue) % dic.length();
        return dic.charAt(shiftedIndex);
    }
    public static String replaceDigits(String s) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                int shiftValue = Character.getNumericValue(currentChar);
                char previousChar = s.charAt(i - 1);
                sBuilder.append(shift(previousChar, shiftValue));
            } else {
                sBuilder.append(currentChar);
            }
        }
            return sBuilder.toString();
    }
    @Test
    public void testReplaceDigits(){
        String s = "a1c1e1";
        String ans = "abcdef";
        assertTrue(ans.equals($1844.replaceDigits(s)));
    }
    @Test
    public void testReplaceDigits2(){
        String s = "a1b2c3d4e";
        String ans = "abbdcfdhe";
        assertTrue(ans.equals($1844.replaceDigits(s)));
    }
}

