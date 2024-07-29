import static org.junit.Assert.assertEquals;
import org.junit.Test;
/*
Number of Changing Keys

You are given a 0-indexed string s typed by a user. Changing a key is defined as using a key different from the last used key.
For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
Return the number of times the user had to change the key.
Note: Modifiers like shift or caps lock won't be counted in changing the key that is 
if a user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.
*/


public class $3019{
    public static int countKeyChanges(String s){
        int count = 0;
        for(int i = 0; i != s.length() - 1;i++){
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i + 1))){
                count++;
            }
        }
        return count;
    }
    @Test
    public void testCountKeyChanges(){
        String s = "aAbBcC";
        int ans = 2;
        assertEquals(ans,$3019.countKeyChanges(s));
    }
    @Test
    public void testCountKeyChanges2(){
        String s = "AaAaAaaA";
        int ans = 0;
        assertEquals(ans,$3019.countKeyChanges(s));
    }
}
