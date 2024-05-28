
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
/*
Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
*/


public class $344{
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char aux = s[left];
            s[left] = s[right];
            s[right] = aux;
            left++;
            right--;
        }
    }
    @Test
    public void testReverseString(){
        char[] s = {'h','e','l','l','o'};
        char[] ans = {'o','l','l','e','h'};
        reverseString(s);
        assertTrue(Arrays.equals(ans, s));
        }
        @Test
        public void testReverseString2(){
            char[] s = {'H','a','n','n','a','h'};
            char[] ans = {'h','a','n','n','a','H'};
            reverseString(s);
            assertTrue(Arrays.equals(ans, s));
            }
}
