import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
Check If Two String Arrays are Equivalent

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.
*/
public class $1662  {
    public static int sumOfLetters(String[] word){
        int sum = 0;
        for(int i = 0; i != word.length; i++){
            sum = sum + word[i].length();
        }
        return sum;
    }
    public static String concatString(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(sumOfLetters(word1) != sumOfLetters(word2)){
            return false;
        }
        return((concatString(word1)).equals(concatString(word2)));
    }
    @Test
    public void testArrayStringAreEqual(){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean ans = true;
        assertTrue( ans == $1662.arrayStringsAreEqual(word1,word2));
    }
    @Test
    public void testArrayStringAreEqual2(){
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        boolean ans = false;
        assertTrue( ans == $1662.arrayStringsAreEqual(word1,word2));
    }
    @Test
    public void testArrayStringAreEqual3(){
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        boolean ans = true;
        assertTrue( ans == $1662.arrayStringsAreEqual(word1,word2));
    }
}
