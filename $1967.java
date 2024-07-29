import static org.junit.Assert.assertEquals;
import org.junit.Test;
/*
Number of Strings That Appear as Substrings in Word

Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
A substring is a contiguous sequence of characters within a string.
*/

public class $1967{
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i != patterns.length;i++){
            if( word.contains(patterns[i]) ){
                count++;
            }
        }
        return count;
    }
    @Test
    public void testNumOfStrings(){
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int ans = 3;
        assertEquals(ans,$1967.numOfStrings(patterns,word)); 
    }    
    @Test
    public void testNumOfStrings2(){
        String[] patterns = {"a","b","c"};
        String word = "aaaaabbbbb";
        int ans = 2;
        assertEquals(ans,$1967.numOfStrings(patterns,word)); 
    }    
    @Test
    public void testNumOfStrings3(){
        String[] patterns = {"a","a","a"};
        String word = "ab";
        int ans = 3;
        assertEquals(ans,$1967.numOfStrings(patterns,word)); 
    } 
}
