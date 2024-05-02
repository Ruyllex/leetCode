import org.junit.Test;
/*
Shuffle String

You are given a string s and an integer array indices of the same length. 
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
*/

public class  $1528 {
    public static String restoreString(String s, int[] indices) {
        String ans = "";
        for(int i = 0; i != indices.length; i++){
            ans += s.charAt(indices[i]);
        }
        return ans;
    }
    @Test
    public void testrestoreString(){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = "leetcdoe";
        assert ans.equals($1528.restoreString(s,indices));
    }
    @Test
    public void testrestoreString2(){
        String s = "abc";
        int[] indices = {0,1,2};
        String ans = "abc";
        assert ans.equals($1528.restoreString(s,indices));
    }
}
