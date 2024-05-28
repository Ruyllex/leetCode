
import org.junit.Test;
/*
Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/


public class $557{
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString()).append(" ");
            }
            return sb.toString().trim();
            }
    @Test
    public void testreverseWords() {
        String s = "Let's take LeetCode contest";
        String ans = "s'teL ekat edoCteeL tsetnoc";
        assert ans.equals($557.reverseWords(s));
        }

    @Test
    public void testreverseWords2(){
        String s = "Mr Ding";
        String ans = "rM gniD";
        assert ans.equals($557.reverseWords(s));


    }

}