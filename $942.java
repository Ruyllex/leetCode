import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
/*
DI String Match

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

    s[i] == 'I' if perm[i] < perm[i + 1], and
    s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
*/

public class $942{
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];
        int low = 0, high = n;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = low++;
            } else {
                ans[i] = high--;
            }
        }
        ans[n] = low; 
        return ans;
    }
    @Test
    public void testDiStringMatch(){
        String s = "IDID";
        int[] ans = {0,4,1,3,2};
        assertArrayEquals(ans, $942.diStringMatch(s));
    }
    @Test
    public void testDiStringMatch2(){
        String s = "III";
        int[] ans = {0,1,2,3};
        assertArrayEquals(ans, $942.diStringMatch(s));
    }
    @Test
    public void testDiStringMatch3(){
        String s = "DDI";
        int[] ans = {3,2,0,1};
        assertArrayEquals(ans, $942.diStringMatch(s));
    }
}