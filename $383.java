import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
/*
Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can 
be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
*/


public class $383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomNoteLarge = ransomNote.length();
        int magazineLarge = magazine.length();
        if(ransomNoteLarge > magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i != magazineLarge; i++){
            char aux = magazine.charAt(i);
            if(map.containsKey(aux)){
               map.put(aux,map.get(aux) + 1); 
            }
            else{
                map.put(aux,1);
            }
        }
        for(int j = 0; j != ransomNoteLarge; j++){
            if(ransomNoteLarge == 0){
                return true;
            }
            char aux = ransomNote.charAt(j);
            if(!map.containsKey(aux)){
                return false;
            }
            if(map.get(aux) >= 1){
                map.put(aux,map.get(aux) - 1);
                magazineLarge--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    @Test
    public void testCanConstruct(){
        String ransomNote = "a";
        String magazine = "b";
        assertFalse(canConstruct(ransomNote, magazine));
    }
    @Test
    public void testCanConstruct2(){
        String ransomNote = "aa";
        String magazine = "ab";
        assertFalse(canConstruct(ransomNote, magazine));
    }
    @Test
    public void testCanConstruct3(){
        String ransomNote = "aa";
        String magazine = "aab";
        assertTrue(canConstruct(ransomNote, magazine));
    }
}