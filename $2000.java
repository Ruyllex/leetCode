import org.junit.Test;
/*
Reverse Prefix of Word

Given a 0-indexed string word and a character ch, 
reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive).
 The resulting string will be "dcbaefd".
Return the resulting string.
*/

public class $2000  {
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        return sb.reverse().append(word.substring(index + 1)).toString();
    }
    @Test
    public void testReversePrefix(){
        String word = "abcdefd";
        char ch = 'd';
        String ans = "dcbaefd";
        assert ans.equals($2000.reversePrefix(word,ch));
    }
    @Test
    public void testReversePrefix2(){
        String word = "xyxzxe";
        char ch = 'z';
        String ans = "zxyxxe";
        assert ans.equals($2000.reversePrefix(word,ch));
    }
}
