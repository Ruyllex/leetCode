import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.
*/

public class $205 {
    public static boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200]; 
        int[] indexT = new int[200]; 
        int len = s.length();
        if(len != t.length()) {
            return false;
        }
        for(int i = 0; i < len; i++) {
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; 
            }
            indexS[s.charAt(i)] = i + 1; 
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }    
    @Test
    public void testIsIsomorphic(){
        String s = "egg";
        String t = "add";
        assertTrue($205.isIsomorphic(s,t));
    }
    @Test
    public void testIsIsomorphic2(){
        String s = "foo";
        String t = "bar";
        assertFalse($205.isIsomorphic(s,t));
    }
    @Test
    public void testIsIsomorphic3(){
        String s = "paper";
        String t = "title";
        assertTrue($205.isIsomorphic(s,t));
    }
    @Test
    public void testIsIsomorphic4(){
        String s = "badc";
        String t = "baba";
        assertFalse($205.isIsomorphic(s,t));
    }
    @Test
    public void testIsIsomorphic5(){
        String s = "aaeaa";
        String t = "uuxyy";
        assertFalse($205.isIsomorphic(s,t));
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$205");
    }
}
