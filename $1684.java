import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
/*
Count the Number of Consistent Strings

You are given a string allowed consisting of distinct characters and an array of strings words. 
A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.
*/

public class $1684  {
    public static boolean check(String s, String allowed){
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }
        return true; 
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(int i = 0; i != words.length ;i++){
            if(check(words[i], allowed)){
                    ans++;
                }
        } 
        return ans;    
    }
    @Test
    public void testCountConsistentStrings(){
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int ans = 2;
        assertEquals(ans, $1684.countConsistentStrings(allowed,words));
    }
    @Test
    public void testCountConsistentStrings2(){
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        int ans = 7;
        assertEquals(ans, $1684.countConsistentStrings(allowed,words));
    }
    @Test
    public void testCountConsistentStrings3(){
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        int ans = 4;
        assertEquals(ans, $1684.countConsistentStrings(allowed,words));
    }

}
