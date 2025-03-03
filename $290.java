import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;
/*
Word Pattern

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

    Each letter in pattern maps to exactly one unique word in s.
    Each unique word in s maps to exactly one letter in pattern.
    No two letters map to the same word, and no two words map to the same letter.

*/

public class $290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] palabras = s.split(" ");
        if (palabras.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>(); 
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String palabra = palabras[i];
            if (!map.containsKey(c)) {
                map.put(c, palabra);
            } else {
                if (!map.get(c).equals(palabra)) {
                    return false; 
                }
            }
            if (!reverseMap.containsKey(palabra)) {
                reverseMap.put(palabra, c);
            } else {
                if (reverseMap.get(palabra) != c) {
                    return false;
                }
            }
        }
        return true;
    }
    
        
     
    
    @Test
    public void testWordPattern(){
        String pattern = "abba";
        String s = "dog cat cat dog";
        assertTrue($290.wordPattern(pattern,s));
    }
    @Test
    public void testWordPattern2(){
        String pattern = "abba";
        String s = "dog cat cat fish";
        assertFalse($290.wordPattern(pattern,s));
    }
    @Test
    public void testWordPattern3(){
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        assertFalse($290.wordPattern(pattern,s));
    }
    @Test
    public void testWordPattern4(){
        String pattern = "abba";
        String s = "dog dog dog dog";
        assertFalse($290.wordPattern(pattern,s));
    }
}
