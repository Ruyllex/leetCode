import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Maximum Repeating Substring

For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. 
The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. 
If word is not a substring of sequence, word's maximum k-repeating value is 0.

Given strings sequence and word, return the maximum k-repeating value of word in sequence.
*/


public class $1668 {
    public static int maxRepeating(String sequence, String word) {
        int ans = 0;
        String repeatedWord = word;
        while (sequence.contains(repeatedWord)) {
            ans++;  
            repeatedWord += word;
        }
        return ans;
    }
    @Test
    public void testMaxRepeating(){
        String sequence = "ababc";
        String word = "ab";
        int ans = 2;
        assertEquals(ans, $1668.maxRepeating(sequence,word));
    } 
    @Test
    public void testMaxRepeating2(){
        String sequence = "ababc";
        String word = "ba";
        int ans = 1;
        assertEquals(ans, $1668.maxRepeating(sequence,word));
    } 
    @Test
    public void testMaxRepeating3(){
        String sequence = "ababc";
        String word = "ac";
        int ans = 0;
        assertEquals(ans, $1668.maxRepeating(sequence,word));
    } 
    @Test
    public void testMaxRepeating4(){
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        int ans = 5;
        assertEquals(ans, $1668.maxRepeating(sequence,word));
    } 
}