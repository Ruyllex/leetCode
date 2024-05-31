import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
/*
Permutation Difference between Two Strings

You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.
The permutation difference between s and t is defined as the sum of the absolute difference between the index of the occurrence 
of each character in s and the index of the occurrence of the same character in t.
Return the permutation difference between s and t.
*/

public class $3146  {
    public static int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>(); 
        for(int i = 0; i != s.length();i++){
            map.put(s.charAt(i), i);
            }
        for(int j = 0; j != t.length();j++){
            if(map.containsKey(t.charAt(j))){
                map.put((Character)t.charAt(j),Math.abs(map.get(t.charAt(j)) - j));
            }
        }
        int sum = 0;
        for(int i = 0; i != s.length();i++){
            sum += map.get(s.charAt(i));
        }
        return sum;
    }
    @Test
    public void testFindPermutationDifference() {
        String s = "abc";
        String t = "bac";
        int ans = 2;
        assertEquals(ans, $3146.findPermutationDifference(s,t));
    }
    @Test
    public void testFindPermutationDifference2() {
        String s = "abcde";
        String t = "edbac";
        int ans = 12;
        assertEquals(ans, $3146.findPermutationDifference(s,t));
    }
}
