import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

/*
Find Words Containing Character

You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.
*/

public class $2942  {
    public static boolean searchCaracter(String texto, char caracter) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                return true; 
            }
        }
        return false;
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i != words.length; i++){
            if(searchCaracter(words[i],x)){
                ans.add(i);
            }
        }
        return ans;
    }
    @Test
    public void testFindWordsContaning(){
        String [] words = {"leet","code"};
        char x = 'e';
        List<Integer> ans = new ArrayList<>(List.of(0,1));
        assertEquals(ans, $2942.findWordsContaining(words,x));
    }
    @Test
    public void testFindWordsContaning2(){
        String [] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> ans = new ArrayList<>(List.of(0,2));
        assertEquals(ans, $2942.findWordsContaining(words,x));
    }
    @Test
    public void testFindWordsContaning3(){
        String [] words = {"abc","bcd","aaaa","cbc"};
        char x = 'z';
        List<Integer> ans = new ArrayList<>(List.of(0,2));
        assertEquals(ans, $2942.findWordsContaining(words,x));
    }

}
