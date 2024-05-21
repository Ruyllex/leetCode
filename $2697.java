import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*
Lexicographically Smallest Palindrome

You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. 
In one operation, you can replace a character in s with another lowercase English letter.

Your task is to make s a palindrome with the minimum number of operations possible. 
If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ,
 string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

Return the resulting palindrome string.
*/

public class $2697  {
    public static String makeSmallestPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while(i < j){
            if(c[i] < c[j]){
                c[j--] = c[i++];
            }else {
                c[i++] = c[j--];
            }
        }
        return new String(c);
    }
    @Test
    public void testMakeSmallestPalindrome(){
        String s = "egcfe";
        String ans = "efcfe";
        assertEquals(ans,$2697.makeSmallestPalindrome(s));
    }
    @Test
    public void testMakeSmallestPalindrome2(){
        String s = "abcd";
        String ans = "abba";
        assertEquals(ans,$2697.makeSmallestPalindrome(s));

    }
    @Test
    public void testMakeSmallestPalindrome3(){
        String s = "seven";
        String ans = "neven";
        assertEquals(ans,$2697.makeSmallestPalindrome(s));
    } 
    
    
}
