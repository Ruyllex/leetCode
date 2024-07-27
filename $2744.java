import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Find Maximum Number of String Pairs
    
You are given a 0-indexed array words consisting of distinct strings.

The string words[i] can be paired with the string words[j] if:

    The string words[i] is equal to the reversed string of words[j].
    0 <= i < j < words.length.

Return the maximum number of pairs that can be formed from the array words.
Note that each string can belong in at most one pair.
*/
public class $2744{
    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i = 0;i != words.length; i++){
            String word = words[i];
            String reversed = new StringBuilder(word).reverse().toString();
            for(int j = i + 1;j != words.length; j++){
                if(words[j].equals(reversed)){
                    count++;
                }
            }
        }
        return count;
    }
    @Test
    public void testMaximunNumberOfStringPairs(){
        String[] words = {"cd","ac","dc","ca","zz"};
        int ans = 2;
        assertEquals(ans, $2744.maximumNumberOfStringPairs(words));
    }
    @Test
    public void testMaximunNumberOfStringPairs2(){
        String[] words = {"ab","ba","cc"};
        int ans = 1;
        assertEquals(ans, $2744.maximumNumberOfStringPairs(words));
    }
    @Test
    public void testMaximunNumberOfStringPairs3(){
        String[] words = {"aa","ab"};
        int ans = 0;
        assertEquals(ans, $2744.maximumNumberOfStringPairs(words));
    }
}
