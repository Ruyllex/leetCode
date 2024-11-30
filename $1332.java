import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
Remove Palindromic Subsequences

You are given a string s consisting only of letters 'a' and 'b'. In a single step you can remove one palindromic subsequence from s.
Return the minimum number of steps to make the given string empty.
A string is a subsequence of a given string if it is generated by deleting some characters of a given string without changing its order.
Note that a subsequence does not necessarily need to be contiguous.
A string is called palindrome if is one that reads the same backward as well as forward.

*/

public class $1332 {
    public static int removePalindromeSub(String s) {
        return s.isEmpty() ? 0 : (s.equals(new StringBuilder(s).reverse().toString()) ? 1:2);
    }
    @Test
    public void testRemovePalindromeSub(){
        String s = "ababa";
        int ans = 1;
        assertEquals(ans, $1332.removePalindromeSub(s));
    }
    @Test
    public void testRemovePalindromeSub2(){
        String s = "abb";
        int ans = 2;
        assertEquals(ans, $1332.removePalindromeSub(s));
    }
    
}