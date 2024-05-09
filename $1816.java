import org.junit.Test;

/*
Truncate Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
Each of the words consists of only uppercase and lowercase English letters (no punctuation).
For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. 
Return s​​​​​​ after truncating it.
*/


public class  $1816  {
    public static String truncateSentence(String s, int k) {
        String[] a  =  s.split(" ");
        String ans = "";
        for(int i = 0; i != k;i++){
            if( i == k - 1){
                ans += a[i];
            }
            else{
                ans += a[i] + " ";
            }
        }
        return ans;
    }
    @Test
    public void testTruncateSentence(){
        String s = "Hello how are you Contestant";
        int k = 4;
        String ans = "Hello how are you";
        ans.equals($1816.truncateSentence(s,k));
    }    
    @Test
    public void testTruncateSentence2(){
        String s = "What is the solution to this problem";
        int k = 4;
        String ans = "What is the solution";
        ans.equals($1816.truncateSentence(s,k));
    } 
    @Test
    public void testTruncateSentence3(){
        String s = "chopper is not a tanuki";
        int k = 5;
        String ans = "chopper is not a tanuki";
        ans.equals($1816.truncateSentence(s,k));
    } 
}
