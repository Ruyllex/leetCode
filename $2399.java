import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/* 
Check Distances Between Same Letters

You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly twice. 
You are also given a 0-indexed integer array distance of length 26.

Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).

In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i]. 
If the ith letter does not appear in s, then distance[i] can be ignored.
Return true if s is a well-spaced string, otherwise return false.
*/

public class $2399 {
public static boolean checkDistances(String s, int[] distance) {
    int[] firstOccurrence = new int[26];
    Arrays.fill(firstOccurrence, -1); 
    for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);
        int charIndex = currentChar - 'a'; 
        if (firstOccurrence[charIndex] == -1) {
            firstOccurrence[charIndex] = i;
        } else {
            int expectedDistance = distance[charIndex];
            int actualDistance = i - firstOccurrence[charIndex] - 1;
            
            if (actualDistance != expectedDistance) {
                return false;
                }
            }
        }
        return true;
    }
    @Test
    public void testCheckDistances(){
        String s = "abaccb";
        int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertTrue($2399.checkDistances(s,distance));
    }
    @Test
    public void testCheckDistances2(){
        String s = "aa";
        int[] distance = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertFalse($2399.checkDistances(s,distance));
    }
}
