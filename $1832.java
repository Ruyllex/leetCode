import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import org.junit.Test;
import java.util.Set;
import java.util.HashSet;

/*
Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
*/

public class  $1832{
    public static boolean checkIfPangram(String sentence) {
        Set<Character> aux = new HashSet<>();
        for(int i = 0; i != sentence.length();i++){
            aux.add(sentence.charAt(i));
        }
        return aux.size() == 26;
    }
    @Test
    public void testCheckIfPangram(){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        assumeTrue($1832.checkIfPangram(sentence));
    }
    @Test
    public void testCheckIfPangram2(){
        String sentence = "leetcode";
        assumeFalse($1832.checkIfPangram(sentence));
    }
    
}
