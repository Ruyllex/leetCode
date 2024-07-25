import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
/*
Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, 
and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.
*/

public class $1703{
    public static boolean halvesAreAlike(String s) {
        int a = 0, b = 0;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
            s.charAt(i) == 'u' || s.charAt(i) == 'A' ||
            s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
            s.charAt(i) == 'O' || s.charAt(i) == 'U')
            a++;
            }
            for(int i = s.length()/2; i < s.length(); i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' || s.charAt(i) == 'A' ||
                s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' || s.charAt(i) == 'U')
                b++;
                }
                return a == b;
        }
    @Test
    public void testHalvesAreAlike(){
        String s = "book";
        assertTrue($1703.halvesAreAlike(s));
    }
    @Test
    public void testHalvesAreAlike2(){
        String s = "textbook";
        assertFalse($1703.halvesAreAlike(s));
    }
    
}
