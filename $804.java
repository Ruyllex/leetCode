import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
/*
Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.
","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.
*/


public class $804  {
    public static String morseCode(String s){
        String[] alpha = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String ans = "";
        for(int j = 0; j != s.length();j++){
            ans += alpha[s.charAt(j) - 'a'];
        }
        return ans;
    }
    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i != words.length; i++){
            set.add(morseCode(words[i]));
        }
        return set.size();
    }
    @Test
    public void testUniqueMorseRepresentations(){
        String[] words = {"gin","zen","gig","msg"};
        int ans = 2;
        assertEquals(ans, $804.uniqueMorseRepresentations(words));
    }
    @Test
    public void testUniqueMorseRepresentations2(){
        String[] words = {"a"};
        int ans = 1;
        assertEquals(ans, $804.uniqueMorseRepresentations(words));
    }
}
